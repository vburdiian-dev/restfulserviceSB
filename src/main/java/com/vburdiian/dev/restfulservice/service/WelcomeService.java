package com.vburdiian.dev.restfulservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WelcomeService {

    @Autowired
    private RestTemplate restTemplate;

    public String makeRequest(String url) {
        return restTemplate.getForObject(url, String.class);
    }
}