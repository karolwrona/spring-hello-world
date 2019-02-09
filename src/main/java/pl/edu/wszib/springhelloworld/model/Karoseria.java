package pl.edu.wszib.springhelloworld.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Karoseria {
    private Drzwi drzwi;
    @Autowired
    public Karoseria(Drzwi drzwi) {
        this.drzwi = drzwi;
    }
}
