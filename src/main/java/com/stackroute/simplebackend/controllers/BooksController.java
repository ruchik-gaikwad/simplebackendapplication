package com.stackroute.simplebackend.controllers;


import com.stackroute.simplebackend.models.Books;
import com.stackroute.simplebackend.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;


@RestController
@CrossOrigin("*")
public class BooksController {
    BookService bookService;

    @Autowired /// This is Called as constructor autowireing | This is DI design pattern
    BooksController(BookService service) {
        this.bookService = service;
    }

    // I

    @GetMapping("/public/api/v1/greet/{message}")
    public ResponseEntity<String> sayHello(@PathVariable String message) {
        System.out.println(message);
        return new ResponseEntity<String>(message, HttpStatus.OK);
    }

    @PostMapping("/public/api/v1/favourites")
    public ResponseEntity<Books> saveFavourite(@RequestBody Books book) {
        Long id =  UUID.randomUUID().getLeastSignificantBits();
        book.setId(id);
        System.out.println(book.toString());
        System.out.println(book);
        Books newBook = this.bookService.createNewBook(book);
        return new ResponseEntity<Books>(newBook, HttpStatus.OK);
    }


}
