package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataBook(@JsonAlias("title") String title,
                      @JsonAlias("languages") List<String> idiom,
                      @JsonAlias("download_count")  Integer numberDownloads)  {
}
