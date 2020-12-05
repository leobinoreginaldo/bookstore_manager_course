package com.reginaldoleobino.bookstoremanager.repository;

import com.reginaldoleobino.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {


}
