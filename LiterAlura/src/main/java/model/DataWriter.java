package model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataWriter(@JsonAlias("name") String name,
                         @JsonAlias("birth_year") int yearBirthday,
                         @JsonAlias("death_year") int yearDeath) {
}
