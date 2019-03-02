package pl.edu.wszib.springhelloworld.configurations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;


@RestController
@RequestMapping("/ErroryAdvice")
public class ErroryAdvice {
    @GetMapping
    public String test2() {
        int liczba = new Random().nextInt(3);

        if (liczba == 0) throw new RuntimeException1();
        else if (liczba == 1) throw new RuntimeException2();
        else throw new RuntimeException3();
    }
}
