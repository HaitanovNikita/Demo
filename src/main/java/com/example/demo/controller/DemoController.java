package com.example.demo.controller;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Data
@Component
@RequiredArgsConstructor
//@ConfigurationProperties("api")
@Profile("test")
public class DemoController {
    @Value("${api.url}")
    private String url;

    public String someMethod() {
        System.out.println("Url: " + url);
        return url;
    }
}
