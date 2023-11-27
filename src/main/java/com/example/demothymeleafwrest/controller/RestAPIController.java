package com.example.demothymeleafwrest.controller;

import com.example.demothymeleafwrest.controller.model.SearchModel;
import com.example.demothymeleafwrest.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestAPIController {

    @GetMapping("data/some-data")
    public List<Book> anExampleOfSomeRestData() {
        List<Book> books = new ArrayList<>();

        books.add(new Book("In Search of Lost Time", "Marcel Proust"));

        return books;
    }

    @PostMapping("data/some-kind-of-search")
    public List<Book> anExampleOfPostingDataForSearch(@RequestBody SearchModel searchModel) {
        List<Book> books = new ArrayList<>();

        books.add(new Book(searchModel.getSearchText(), "Someone"));

        return books;
    }

}
