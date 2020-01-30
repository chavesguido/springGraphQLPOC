package com.example.demoGraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demoGraphql.model.Author;
import com.example.demoGraphql.model.Book;
import com.example.demoGraphql.repository.AuthorRepository;
import com.example.demoGraphql.repository.BookRepository;

public class Query implements GraphQLQueryResolver{
	private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    public Query(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public long countBooks() {
        return bookRepository.count();
    }
    public long countAuthors() {
        return authorRepository.count();
    }
}
