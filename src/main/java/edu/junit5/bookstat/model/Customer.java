package edu.junit5.bookstat.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer extends BaseEntity {

    private String firstName;
    private String lastName;
    private LocalDate dob;
    @Enumerated(EnumType.STRING)
    private County county;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @ManyToMany
    private Set<Book> purchasedBooks = new HashSet<>();

    public void addBook(Book book) {
        purchasedBooks.add(book);
    }

    public void removeBook(Book book) {
        purchasedBooks.remove(book);
    }
}
