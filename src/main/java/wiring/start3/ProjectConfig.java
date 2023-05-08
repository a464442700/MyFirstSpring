package wiring.start3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//@ComponentScan(basePackages = "wiring.start3")
public class ProjectConfig {
    @Bean
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }
//-----------------------------//
//不使用@Autowired，注入多个Bean中的一个
//    @Bean
//    public Person person(@Qualifier("parrot2") Parrot parrot) {
//        Person p = new Person(parrot);
//        return p;
//    }
//-----------------------------//
    @Bean
    public Person person() {
        Person p = new Person();
        return p;
    }
//-----------------------------//
}
