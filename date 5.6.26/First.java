package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {
    @GetMapping("/hello")

    public String sayHello(){
        return "hey";
    }
    @GetMapping("/name")

    public String myName(){
        return "Kamali";
    }
    @GetMapping("/address")

    public String myAdd(){
        return "Coimbatore";
    }
    @GetMapping("/hello/name/address/color")

    public String myFav(){
        return "My fav-color is Blue ";
    }
}
