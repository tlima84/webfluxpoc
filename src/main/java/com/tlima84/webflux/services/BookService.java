package com.tlima84.webflux.services;

import com.tlima84.webflux.repository.BookRepository;
import com.tlima84.webflux.repository.model.Book;
import com.tlima84.webflux.resources.request.BookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Flux<Book> getBooks(){
        return bookRepository.findAll();
    }

    public Mono<Book> findBookById(UUID id){
        return bookRepository.findById(id);
    }

    public Mono<Book> setBook(BookRequest bookRequest){
        return bookRepository.save(Book.builder()
                .id(UUID.randomUUID())
                .name(bookRequest.getName())
                .author(bookRequest.getAuthor()).build());
    }

}
