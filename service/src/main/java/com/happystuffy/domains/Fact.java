package com.happystuffy.domains;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "facts")
public class Fact implements Serializable {

    @Id
    private String id;
    private LocalDate date;
    private String title;
    private String description;

    public Fact(LocalDate date, String title, String description) {
        this.date = date;
        this.title = title;
        this.description = description;
    }

}
