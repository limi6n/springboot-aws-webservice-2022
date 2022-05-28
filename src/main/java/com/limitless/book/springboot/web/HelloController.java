package com.limitless.book.springboot.web;

import com.limitless.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    private String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    private HelloResponseDto hello(@RequestParam("name") String name,
                                   @RequestParam("amount") int amount) {

        return new HelloResponseDto(name, amount);
    }
}
