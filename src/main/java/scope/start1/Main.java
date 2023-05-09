package scope.start1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import scope.start1.model.Comment;
import scope.start1.services.CommentService;
import scope.start1.ProjectConfiguration;
import scope.start1.services.UserService;

public class Main {

        public static void main(String[] args) {
            var c = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
            var cs1 = c.getBean(CommentService.class);
            var cs2 = c.getBean(UserService.class);
            boolean b1 = cs1.getCommentRepository() == cs2.getCommentRepository();
            System.out.println(b1);
        }
}
