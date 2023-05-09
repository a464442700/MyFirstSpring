package scope.start3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import scope.start3.services.CommentService;
import scope.start3.services.UserService;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var us1 = c.getBean(UserService.class);
        System.out.println("获取us1");
        var us2 = c.getBean(UserService.class);
        System.out.println("获取us2");
    }
}
