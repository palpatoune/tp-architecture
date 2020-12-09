package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.ExecutionException;

@org.springframework.web.bind.annotation.RestController
public class RestController {


    @GetMapping("/test")
    public String addContributorMeeting(@RequestParam String test) throws ExecutionException, InterruptedException {
        return "ça marche bien frere voici  ce que tu m'a envoyé :" + test;
    }
}
