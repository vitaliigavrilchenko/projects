package com.linux.project.api;

import com.linux.project.model.Book;
import com.linux.project.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/name")
    @ResponseBody
    public String bookName() {
        return bookService.findById(1).getName();
    }

    @RequestMapping("/colour")
    @ResponseBody
    public String bookColour() {
        return bookService.findById(2).getColour();
    }

    @RequestMapping("/add")
    @ResponseBody
    public String addBook() {
        bookService.addBook(new Book(333, "red", "zhenya", "bookname"));
        return "book added";
    }

    @RequestMapping("/count")
    @ResponseBody
    public Long numberOfBooks() {
        return bookService.getNumberOfBooks();
    }


}
