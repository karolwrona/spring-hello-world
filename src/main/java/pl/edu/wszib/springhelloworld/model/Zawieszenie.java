package pl.edu.wszib.springhelloworld.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Zawieszenie {
    private Silnik silnik;
    private SkrzyniaBiegow skrzyniaBiegow;
    private UkladSterowania ukladSterowania;
    @Autowired
    public Zawieszenie(Silnik silnik, SkrzyniaBiegow skrzyniaBiegow, UkladSterowania ukladSterowania) {
        this.silnik = silnik;
        this.skrzyniaBiegow = skrzyniaBiegow;
        this.ukladSterowania = ukladSterowania;
    }
}
