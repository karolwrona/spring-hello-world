package pl.edu.wszib.springhelloworld.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.edu.wszib.springhelloworld.model.EkspresDoKawy;
import pl.edu.wszib.springhelloworld.model.Komputer;
import pl.edu.wszib.springhelloworld.model.Kubek;
import pl.edu.wszib.springhelloworld.model.Programista;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;
import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

@Configuration
public class MainConfiguration {

    @Bean
    public Programista marek(Kubek kubek, Komputer komputer, EkspresDoKawy ekspresDoKawy) {
        return new Programista(kubek, komputer, ekspresDoKawy);
    }

    @Bean
    public Programista maciej(Kubek kubek, Komputer komputer, EkspresDoKawy ekspresDoKawy) {
        return new Programista(kubek, komputer, ekspresDoKawy);
    }

    @Bean
    public Programista lukasz(Kubek kubek, Komputer komputer, EkspresDoKawy ekspresDoKawy) {
        return new Programista(kubek, komputer, ekspresDoKawy);
    }

    @Bean
    @Scope(SCOPE_PROTOTYPE)
    public Komputer kumputer() {
        return new Komputer();
    }

    @Bean
    @Scope(SCOPE_SINGLETON)
    public EkspresDoKawy ekspresDoKawy() {
        return new EkspresDoKawy();
    }

    @Bean
    @Scope("prototype")
    public Kubek kubek() {
        return new Kubek();
    }

}
