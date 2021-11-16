package com.example.accessingdatamysql;

import java.util.List;

public interface BookService {
    Book create(Book book);
    List<Book> readAll();
    Book read(String isbn);
    boolean update(Book book);
    boolean delete(String isbn);
}
