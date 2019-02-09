package pl.edu.wszib.springhelloworld.model;

import org.springframework.stereotype.Component;

@Component
public class Tygrys extends Kot {

    @Override
    public void glos() {
        System.out.println("Roar");
    }
}
