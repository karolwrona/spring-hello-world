package pl.edu.wszib.springhelloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.edu.wszib.springhelloworld.model.Ciastko;
import pl.edu.wszib.springhelloworld.model.Dziecko;

@Configuration
public class MyConfig2 {
    @Bean
    @Scope("prototype")
    public Ciastko ctastko() {
        return new Ciastko();
    }

    @Bean
    public Dziecko jas(Ciastko ciastko) {
        return new Dziecko(ciastko);
    }

    @Bean
    public Dziecko malgosia(Ciastko ciastko) {
        return new Dziecko(ciastko);
    }
    @Bean
    public String test(Dziecko jas, Dziecko malgosia) {
        jas.ugryz();
        malgosia.ugryz();
        return"";
    }
}
