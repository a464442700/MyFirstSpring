import com.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
      //  Parrot p = new Parrot();
        var context =new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Parrot p2 = context.getBean("parrot2",Parrot.class);
//        Parrot p1 = context.getBean("parrot",Parrot.class);
//       System.out.println(p1.getName());

        Parrot p1 = context.getBean(Parrot.class);
        System.out.println(p1.getName());
    }
}
