package service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.DataBook;
import model.DataWriter;

public class ConvertData implements IConvertData{
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T getData(String json, Class<T> classe) {
        T result = null;
        try {
            if (classe == DataBook.class) {
                JsonNode node = mapper.readTree(json);
                var s = node.get("results").get(0);
                result = mapper.treeToValue(s, classe);
            } else if (classe == DataWriter.class) {
                JsonNode node = mapper.readTree(json);
                var s = node.get("results").get(0).get("authors").get(0);
                result = mapper.treeToValue(s, classe);
            } else {
                result = mapper.readValue(json, classe);
            }
        } catch (JsonProcessingException e) {
            e.getStackTrace();
            throw new RuntimeException(e);
        }
        return result;
    }

}
