package com.jiker.jenkins.first.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsFirstTestController {

    @GetMapping("/hello")
    public String hello(){
        return "hello jenkins";
    }

}
