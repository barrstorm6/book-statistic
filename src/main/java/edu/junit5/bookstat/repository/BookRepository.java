package edu.junit5.bookstat.repository;


import edu.junit5.bookstat.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
