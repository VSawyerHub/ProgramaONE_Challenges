package model;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String title;
    @ManyToOne
    private Writer writer;
    private String idiom;
    private Integer numberDownloads;

    public Book() {
    }

    public Book(DataBook data) {
        this.title = data.title();
        this.idiom = String.join(",", data.idiom());
        this.numberDownloads = data.numberDownloads();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public String getIdiom() {
        return idiom;
    }

    public void setIdiom(String idiom) {
        this.idiom = idiom;
    }

    public Integer getNumberDownloads() {
        return numberDownloads;
    }

    public void setNumberDownloads(Integer numberDownloads) {
        this.numberDownloads = numberDownloads;
    }

    @Override
    public String toString() {
        return "\n---------------------------------------"+
                "\nTítle: " + title +
                "\nIdiom: " + idiom +
                "\nWriter: " + writer.getName() +
                "\nNumber of downloads: " + numberDownloads;
    }
}

