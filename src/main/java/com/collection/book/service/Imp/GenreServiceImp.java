package com.collection.book.service.Imp;

import java.util.List;
import java.util.Optional;

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

    @Override
    public String deleteGenre(Long id) {
        Optional<Genre> genre = genreRepository.findById(id);
        if (genre.isPresent()) {
            genreRepository.deleteById(id);
            return "Genre deleted";
        }
        return "Genre not found";
    }

}
