package pl.edu.wszib.springhelloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.edu.wszib.springhelloworld.model.KartaDoGlosowania;
import pl.edu.wszib.springhelloworld.model.Urna;
import pl.edu.wszib.springhelloworld.model.Wyborca;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;
import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

@Configuration
public class MyConfiguration {
    @Bean
    @Scope(SCOPE_PROTOTYPE)
    public KartaDoGlosowania kartaDoGlosowania() {
        return new KartaDoGlosowania();
    }
    @Bean
    @Scope(SCOPE_SINGLETON)
    public Urna urna(Wyborca wyborca1, Wyborca wyborca2, Wyborca wyborca3) {
         Urna u = new Urna();
         wyborca1.oddajGlos(u);
         wyborca2.oddajGlos(u);
         wyborca3.oddajGlos(u);
         u.zlicz();
         return u;
    }
    @Bean("wyborca1")
    public Wyborca wyborca1(KartaDoGlosowania kartaDoGlosowania) {
        return new Wyborca(kartaDoGlosowania());
    }
    @Bean("wyborca2")
    public Wyborca wyborca2(KartaDoGlosowania kartaDoGlosowania) {
        return new Wyborca(kartaDoGlosowania());
    }
    @Bean("wyborca3")
    public Wyborca wyborca3(KartaDoGlosowania kartaDoGlosowania) {
        return new Wyborca(kartaDoGlosowania());
    }




}
