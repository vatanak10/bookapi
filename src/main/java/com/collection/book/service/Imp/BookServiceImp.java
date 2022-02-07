package com.collection.book.service.Imp;

import java.util.List;

import com.collection.book.dto.BodyRequestDto;
import com.collection.book.model.Book;
import com.collection.book.repositories.BookRepository;
import com.collection.book.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> getBookByAuthor(BodyRequestDto body) {
        return bookRepository.findAllByAuthor(body.getBody());
    }

    @Override
    public List<Book> getBookByGenre(BodyRequestDto body) {
        return bookRepository.findAllByGenre(body.getBody());
    }

    @Override
    public Book getBookByID(Long id) {
        return bookRepository.getById(id);
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

}
