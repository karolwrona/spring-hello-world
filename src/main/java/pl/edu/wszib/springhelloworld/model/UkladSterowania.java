package pl.edu.wszib.springhelloworld.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UkladSterowania {
    private Kierownica kierownica;
    @Autowired
    public UkladSterowania(Kierownica kierownica) {
        this.kierownica = kierownica;
    }
}
