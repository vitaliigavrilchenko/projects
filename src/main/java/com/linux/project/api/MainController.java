package com.linux.project.api;

import com.linux.project.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    public BookService bookService = new BookService();

    @RequestMapping("/name")
    @ResponseBody
    public String bookName() {
        return bookService.findById(20).getName();
    }

    @RequestMapping("/colour")
    @ResponseBody
    public String bookColour() {
        return bookService.findById(10).getColour();
    }
}
