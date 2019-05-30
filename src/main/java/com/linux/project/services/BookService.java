package com.linux.project.services;

import com.linux.project.dao.BookDao;
import com.linux.project.model.Book;

public class BookService {

    private BookDao bookDao = new BookDao();

    public Book findById(int id) {
        return bookDao.getBookById(id);
    }

    public void addBook(Book book) {
        bookDao.addBook(book);
    }
}
