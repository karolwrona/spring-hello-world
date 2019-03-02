package pl.edu.wszib.springhelloworld.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Header")
public class  Header {
    @GetMapping
    public String test () {
        throw new RuntimeException();
       // return "index";
    }
    @ExceptionHandler(RuntimeException.class)
    public String exception() {
        return "ERROR!!!";
    }
}
