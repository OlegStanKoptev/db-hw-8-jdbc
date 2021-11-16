package com.example.accessingdatamysql;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.accessingdatamysql.Book;
import org.springframework.stereotype.Repository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
