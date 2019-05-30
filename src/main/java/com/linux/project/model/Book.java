package com.linux.project.model;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int pages;
    private String colour;
    private String author;
    private String name;

    public Book() {
    }

    public int getId() {
        return id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", pages=" + pages +
                ", colour='" + colour + '\'' +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
