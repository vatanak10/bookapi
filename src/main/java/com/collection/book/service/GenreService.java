package com.collection.book.service;

import java.util.List;

import com.collection.book.model.Genre;

import org.springframework.stereotype.Service;

@Service
public interface GenreService {
    List<Genre> getAllGenres();

    Genre addGenre(Genre genre);

    String deleteGenre(Long id);
}
