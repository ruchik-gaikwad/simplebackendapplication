package com.stackroute.simplebackend.dao;

import com.stackroute.simplebackend.models.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao extends CrudRepository<Books, Integer> {
}
