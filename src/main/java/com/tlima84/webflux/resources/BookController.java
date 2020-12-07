package com.tlima84.webflux.resources;

import com.tlima84.webflux.repository.model.Book;
import com.tlima84.webflux.resources.request.BookRequest;
import com.tlima84.webflux.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/v1/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Flux<Book> getBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Book> getBookById(@PathVariable UUID id){
        return bookService.findBookById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Book> setBook(@RequestBody BookRequest bookRequest){
        return bookService.setBook(bookRequest);
    }
}
