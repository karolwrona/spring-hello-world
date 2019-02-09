package pl.edu.wszib.springhelloworld.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Samochod {
    private Karoseria karoseria;
    private Zawieszenie zawieszenie;
    @Autowired
    public Samochod(Karoseria karoseria, Zawieszenie zawieszenie) {
        this.karoseria = karoseria;
        this.zawieszenie = zawieszenie;
    }
}
