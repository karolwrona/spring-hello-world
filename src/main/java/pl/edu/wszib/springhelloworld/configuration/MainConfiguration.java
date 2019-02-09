package pl.edu.wszib.springhelloworld.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.edu.wszib.springhelloworld.model.*;

import java.security.PublicKey;

@Configuration
public class MainConfiguration {

    @Bean
    public Dziecko jas(@Qualifier("Klocki") Zabawka zabawka) {
        Dziecko jas = new Jas(zabawka);
        jas.odpakuj();
        return jas;
    }

    @Bean
    public Dziecko malgosia(@Qualifier("Mis") Zabawka zabawka) {
        Dziecko malgosia = new Malgosia(zabawka);
        malgosia.odpakuj();
        return malgosia;
    }

    @Bean
    public Dziecko grzes(@Qualifier("Samochodzik") Zabawka zabawka) {
        Dziecko grzes = new Grzes(zabawka);
        grzes.odpakuj();
        return grzes;
    }
    @Bean
    @Qualifier("Samochodzik")
    public Zabawka samochodzik(){
        return new Samochodzik();
    }
    @Bean
    @Qualifier("Mis")
    public Zabawka mis(){
        return new Mis();
    }
    @Bean
    @Qualifier("Klocki")
    public Zabawka klocki(){
        return new Klocki();
    }

}
