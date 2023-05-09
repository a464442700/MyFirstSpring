package scope.start4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import scope.start4.services.UserService;

public class Main {

    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var us1 = c.getBean(UserService.class);
        var comment=new Comment();
        comment.setText("Spring很方便");
        us1.sendComment(comment);
        us1.sendComment(comment);
    }
}
