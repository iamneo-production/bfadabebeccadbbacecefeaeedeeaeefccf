package com.example.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController
{
    @GetMapping("/welcome")
    public String Welcome()
    {
        return "Welcome String Boot!";
    }
}