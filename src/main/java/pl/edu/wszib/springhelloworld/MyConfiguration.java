package pl.edu.wszib.springhelloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.springhelloworld.model.Kot;
import pl.edu.wszib.springhelloworld.model.Tygrys;

@Configuration
public class MyConfiguration {
    @Bean
    public Tygrys tygrys() {
        return new Tygrys();
    }
    @Bean
    public String execute(Kot kot) {
        kot.glos();
        return"";
    }
}
