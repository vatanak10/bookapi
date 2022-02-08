package com.collection.book.service.Imp;

import java.util.List;
import java.util.Optional;

import com.collection.book.model.Author;
import com.collection.book.repositories.AuthorRepository;
import com.collection.book.service.AuthorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImp implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public String deleteAuthor(Long id) {
        Optional<Author> author = authorRepository.findById(id);
        if (author.isPresent()) {
            authorRepository.deleteById(id);
            return "Author deleted";
        }
        return "Author not found";
    }

}
