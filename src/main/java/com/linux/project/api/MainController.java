package com.linux.project.api;

import com.linux.project.model.Book;
import com.linux.project.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    private BookService bookService;

    @GetMapping("/bookinfo/{id}")
    public String bookName(@PathVariable("id") int id, Model model) {
        Book book = bookService.findById(id);
        model.addAttribute("id", id);
        model.addAttribute("name", book.getName());
        model.addAttribute("pages", book.getPages());
        model.addAttribute("author", book.getAuthor());
        model.addAttribute("colour", book.getColour());
        return "bookinfo";
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
