package pl.edu.wszib.springhelloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import pl.edu.wszib.springhelloworld.model.Kot;
import pl.edu.wszib.springhelloworld.model.Tygrys;

@Configuration
public class MyConfiguration {
    @Bean ("burek")
    public Kot kot1() {
        return new Kot();
    }

    @Bean
    @Primary //jak nie wskazany inny to zawsze on!
    public Kot kot2() {
        return new Kot();
    }
    @Bean
    public Kot kot3() {
        return new Kot();
    }

    @Bean String execute(@Qualifier("burek") Kot dsfsdf) {
        return "";
    }
}
