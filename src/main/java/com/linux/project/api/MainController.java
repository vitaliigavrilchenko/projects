package com.linux.project.api;

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
        return bookService.findById(1).getColour();
    }
}
