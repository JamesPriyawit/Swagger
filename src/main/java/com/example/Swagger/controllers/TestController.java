package com.example.Swagger.controllers;

import com.example.Swagger.entities.Answer;
import com.example.Swagger.entities.Input;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public Answer plusNumber(
            @RequestBody Input input
            ){
        Answer answer = new Answer();
        answer.setAnswer(input.getFirstParam() + input.getSecondParam());
        return answer;
    }
}
