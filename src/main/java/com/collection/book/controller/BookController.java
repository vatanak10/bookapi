package com.collection.book.controller;

import java.util.List;

import com.collection.book.dto.BodyRequestDto;
import com.collection.book.model.Book;
import com.collection.book.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping()
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }

    @GetMapping("/author")
    public ResponseEntity<List<Book>> getBookByAuthor(@RequestBody BodyRequestDto body) {
        return new ResponseEntity<>(bookService.getBookByAuthor(body), HttpStatus.OK);
    }

    @GetMapping("/genre")
    public ResponseEntity<List<Book>> getBookByGenre(@RequestBody BodyRequestDto body) {
        return new ResponseEntity<>(bookService.getBookByGenre(body), HttpStatus.OK);
    }

    @GetMapping("/id")
    public ResponseEntity<Book> getBookById(@RequestParam Long id) {
        return new ResponseEntity<>(bookService.getBookByID(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        return new ResponseEntity<>(bookService.addBook(book), HttpStatus.CREATED);
    }

    @DeleteMapping()
    public ResponseEntity<String> deleteBook(@RequestParam Long id) {
        return new ResponseEntity<>(bookService.deleteBook(id), HttpStatus.OK);
    }
}
