package com.stackroute.simplebackend.services;

import com.stackroute.simplebackend.dao.BookDao;
import com.stackroute.simplebackend.models.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {

    BookDao bookDao;

    @Autowired
    BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    public Books createNewBook(Books book) {
        return this.bookDao.save(book);
    }
}
