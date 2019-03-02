package pl.edu.wszib.springhelloworld.configurations;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
@ControllerAdvice
public class MyControllerAdvice {
    @ExceptionHandler(RuntimeException1.class)
    public String exception(){
        return "ERROR1";
    }
    @ExceptionHandler(RuntimeException2.class)
    public String exception1(){
        return "ERROR2";
    }
    @ExceptionHandler(RuntimeException3.class)
    public String exception2(){
        return "ERROR3";
    }
}
