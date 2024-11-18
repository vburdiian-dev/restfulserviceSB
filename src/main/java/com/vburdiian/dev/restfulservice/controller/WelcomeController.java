package com.vburdiian.dev.restfulservice.controller;

import com.vburdiian.dev.restfulservice.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Autowired
    private WelcomeService curlService;

    @GetMapping("/curl")
    public String makeCurlRequest(@RequestParam String url) {
        return curlService.makeRequest(url);
    }

    // welcome page
    @GetMapping("/welcome")
    public String makeWelcomeRequest() {
        return "hello";
    }

}