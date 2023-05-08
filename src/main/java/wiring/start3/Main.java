package wiring.start3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public  class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person =
                context.getBean(Person.class);

        Parrot parrot= person.getParrot();
        System.out.println(parrot.getName());


    }
}