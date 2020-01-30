package com.example.demoGraphql.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demoGraphql.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
