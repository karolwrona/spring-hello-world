package pl.edu.wszib.springhelloworld.configurations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/Errory")
public class Errory {
    @GetMapping
    public String test() {
        int liczba = new Random().nextInt(3);

        if (liczba == 0) throw new RuntimeException1();
        else if (liczba == 1) throw new RuntimeException2();
        else throw new RuntimeException3();
    }


    @ExceptionHandler(RuntimeException1.class)
    public String exception(){
        return "ERROR1";
    }
    @ExceptionHandler(RuntimeException2.class)
    public String exception1(){
        return "Error2";
    }
    @ExceptionHandler(RuntimeException3.class)
    public String exception2(){
        return "ERROR3";
    }
}

