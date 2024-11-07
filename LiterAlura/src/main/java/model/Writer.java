package model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "writers")
public class Writer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    private int yearBirthday;
    private int yearDeath;
    @OneToMany(mappedBy = "writer", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Book> books = new ArrayList<>();

    public Writer(){}

    public Writer (DataWriter data) {
        this.name = data.name();
        this.yearBirthday = data.yearBirthday();
        this.yearDeath = data.yearDeath();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBirthday() {
        return yearBirthday;
    }

    public void setYearBirthday(int yearBirthday) {
        this.yearBirthday = yearBirthday;
    }

    public int getYearDeath() {
        return yearDeath;
    }

    public void setYearDeath(int yearDeath) {
        this.yearDeath = yearDeath;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        books.forEach(l -> l.setWriter(this));
        this.books = books;
    }

    @Override
    public String toString() {
        return "---------------------------------------"+
                "\nNome: " + name +
                "\nData De Nascimento: " + yearBirthday +
                "\nData De Falecimento: " + yearDeath +
                "\n---------------------------------------";
    }
}

