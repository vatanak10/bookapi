package com.collection.book.service;

import java.util.List;

import com.collection.book.model.Author;

import org.springframework.stereotype.Service;

@Service
public interface AuthorService {
    List<Author> getAllAuthors();

    Author addAuthor(Author author);
}
