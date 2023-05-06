package wiring.start1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public  class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person =
                context.getBean(Person.class);
        Parrot parrot =
                context.getBean(Parrot.class);
        parrot.setName("Koko");
        person.setName("Ella");
        System.out.println(
                "Person's name: " + person.getName());

        System.out.println(
                "Parrot's name: " + parrot.getName());

        System.out.println(
                "Person's parrot: " + person.getParrot());
        Parrot parrot1 =
                context.getBean(Parrot.class);
        System.out.println(
                "Parrot1's name: " + parrot1.getName());

    }
}