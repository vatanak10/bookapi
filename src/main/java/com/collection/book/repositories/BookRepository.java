package com.collection.book.repositories;

import java.util.List;

import com.collection.book.model.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByGenre(String genre);

    List<Book> findAllByAuthor(String author);
}
