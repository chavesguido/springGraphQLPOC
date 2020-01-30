package com.example.demoGraphql.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demoGraphql.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
