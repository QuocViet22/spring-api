package com.springboot.api.controller;

import com.springboot.api.model.Main;

import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class MainController {

    private String userPath = "https://springg-api.herokuapp.com/api/v1/users";
    private String filmsPath = "https://springg-api.herokuapp.com/api/v1/films";
    private String actorsPath = "https://springg-api.herokuapp.com/api/v1/actors";
    private String workPath = "https://springg-api.herokuapp.com/api/v1/work";

    //    view main page
    @GetMapping
    public Main view() {
        Main main = new Main();
        main.setAuthor("Hoang Quoc Viet");
        main.setLastUpdate("21-06-2022");
        main.setUser(userPath);
        main.setFilms(filmsPath);
        main.setActors(actorsPath);
        main.setWork(workPath);
        return main;
    }
}

