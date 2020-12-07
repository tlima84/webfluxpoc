package com.tlima84.webflux.repository;

import com.tlima84.webflux.repository.model.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public interface BookRepository extends ReactiveCrudRepository<Book, UUID> {

    Mono<Book> findById(UUID id);

}
