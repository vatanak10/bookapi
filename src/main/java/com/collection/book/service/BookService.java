package com.collection.book.service;

import java.util.List;

import com.collection.book.dto.BodyRequestDto;
import com.collection.book.model.Book;

import org.springframework.stereotype.Service;

@Service
public interface BookService {
    List<Book> getAllBooks();

    List<Book> getBookByAuthor(BodyRequestDto body);

    List<Book> getBookByGenre(BodyRequestDto body);

    Book getBookByID(Long id);

    Book addBook(Book book);
}
