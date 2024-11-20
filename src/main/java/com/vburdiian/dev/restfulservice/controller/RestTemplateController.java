package com.vburdiian.dev.restfulservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestTemplateController {

    private String name;
    private int age;


    // here you can put some data with curl or postman
    // To post in curl just type in terminal:
    // curl -X POST http://localhost:8080/api/guests -H 'Content-Type: application/json' -d '{"lastName":"LN","firstName":"FN"}'
    // I never used a postman, but I know it is easier to work with UI
    @PostMapping("/addsomedata")
    @ResponseStatus(HttpStatus.CREATED)
    public void addData(@RequestParam String name,
                        @RequestParam int age) {
        this.name = name;
        this.age = age;
    }

    // for this particular case it should work with -> curl -X POST "http://localhost:8080/addsomedata?name=John&age=30"



    // http://localhost:8080/api/somedata?name=Anirban
    @GetMapping("/somedata")
    public String somedata(@RequestParam(value = "name", required = false) String name) {
        return "Hi " + name + " here, is some data" + this.name + this.age;
    }
}
