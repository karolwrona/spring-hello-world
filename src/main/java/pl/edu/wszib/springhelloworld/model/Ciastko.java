package pl.edu.wszib.springhelloworld.model;

import org.springframework.stereotype.Component;

@Component
public class Ciastko {

    private boolean ugryzione = false;

    public void ugryz() {
        ugryzione = true;
    }

    public boolean ugryzione() {
        return ugryzione;
    }
}
