package com.collection.book.service.Imp;

import java.util.List;

import com.collection.book.model.Genre;
import com.collection.book.repositories.GenreRepository;
import com.collection.book.service.GenreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreServiceImp implements GenreService {

    @Autowired
    GenreRepository genreRepository;

    @Override
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }

    @Override
    public Genre addGenre(Genre genre) {
        return genreRepository.save(genre);
    }

}
