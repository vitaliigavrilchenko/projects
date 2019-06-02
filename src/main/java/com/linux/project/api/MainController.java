package com.linux.project.api;

import com.linux.project.model.Book;
import com.linux.project.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/addbookform")
    public String addBook (Model model){
        model.addAttribute("book", new Book());
        return "addbookform";
    }

    @PostMapping("/index")
    public String addBook(@ModelAttribute Book book) {
        bookService.addBook(book);
        return "index";
    }

    @GetMapping("/index")
    public String startPage(){
        return "index";
    }


}
