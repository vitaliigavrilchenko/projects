package com.linux.project.services;

import com.linux.project.dao.BookDao;
import com.linux.project.dao.BookRepository;
import com.linux.project.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private BookRepository bookRepository;

    public Book findById(int id) {
        return bookRepository.findById(id).get();
    }

    public void addBook(Book book) {
        bookDao.addBook(book);
    }
}
