package wiring.start3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Person {
    private String name;
    //-----------------------------//
    @Qualifier("parrot2")
    @Autowired
    private Parrot parrot;
    //-----------------------------//
//-----------------------------//
//不使用@Autowired，注入多个Bean中的一个
//    private final Parrot parrot;
//    public Person(@Qualifier("parrot2") Parrot parrot) {
//        this.parrot = parrot;
//    }
//-----------------------------//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }


}
