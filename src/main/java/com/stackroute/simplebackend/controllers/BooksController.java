package com.stackroute.simplebackend.controllers;


import com.stackroute.simplebackend.models.Books;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class BooksController {

    @GetMapping("/public/api/v1/greet/{message}")
    public ResponseEntity<String> sayHello(@PathVariable String message) {
        System.out.println(message);
        return new ResponseEntity<String>(message, HttpStatus.OK);
    }

    @PostMapping("/public/api/v1/favourites")
    public ResponseEntity<Books> saveFavourite(@RequestBody Books book) {
        System.out.println(book.toString());
        return new ResponseEntity<Books>(book, HttpStatus.OK);
    }





}
