package edu.junit5.bookstat.repository;


import edu.junit5.bookstat.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
