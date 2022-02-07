package com.collection.book.controller;

import java.util.List;

import com.collection.book.model.Genre;
import com.collection.book.service.GenreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genre")
public class GenreController {

    @Autowired
    private GenreService genreService;

    @GetMapping()
    public ResponseEntity<List<Genre>> getAllGenres() {
        return new ResponseEntity<>(genreService.getAllGenres(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Genre> addGenre(@RequestBody Genre genre) {
        return new ResponseEntity<>(genreService.addGenre(genre), HttpStatus.CREATED);
    }
}
