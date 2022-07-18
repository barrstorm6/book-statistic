package edu.junit5.bookstat.repository;

import edu.junit5.bookstat.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
