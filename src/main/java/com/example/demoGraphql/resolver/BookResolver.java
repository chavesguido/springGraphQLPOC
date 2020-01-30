package com.example.demoGraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.demoGraphql.model.Author;
import com.example.demoGraphql.model.Book;
import com.example.demoGraphql.repository.AuthorRepository;

public class BookResolver implements GraphQLResolver<Book> {
    private AuthorRepository authorRepository;

    public BookResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author getAuthor(Book book) {
        return authorRepository.findById(book.getAuthor().getId()).get();
    }
}
