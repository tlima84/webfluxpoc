package com.tlima84.webflux.resources.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class BookRequest {

    private UUID id;
    private String name;
    private String author;
}
