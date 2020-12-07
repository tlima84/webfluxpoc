package com.tlima84.webflux.repository.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Builder
@Getter
@Document
@AllArgsConstructor
public class Book {

    @Id
    private UUID id;
    private String name;
    private String author;
}
