package com.example.springapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class controller {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
    @GetMapping("/welcome") 
    public user welcome() {
        return new user("Aaryan", 15);
    }
}
