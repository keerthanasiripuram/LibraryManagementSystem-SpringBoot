package com.keerthana.springboot.lms.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keerthana.springboot.lms.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
