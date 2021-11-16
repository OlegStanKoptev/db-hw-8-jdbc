package com.example.accessingdatamysql;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public void create(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<Book> readAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book read(String isbn) {
        Example<Book> example = Example.of(Book.from(isbn));
        Optional<Book> actual = bookRepository.findOne(example);
        return actual.orElse(null);
    }

    @Override
    public boolean update(Book book) {
        Example<Book> example = Example.of(Book.from(book.getIsbn()));
        Optional<Book> actual = bookRepository.findOne(example);

        if (actual.isPresent()) {
            bookRepository.save(book);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String isbn) {
        Example<Book> example = Example.of(Book.from(isbn));
        Optional<Book> actual = bookRepository.findOne(example);

        if (actual.isPresent()) {
            bookRepository.delete(actual.get());
            return true;
        }
        return false;
    }
}
