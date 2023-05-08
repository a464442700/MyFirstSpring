package abs;
import abs.model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import abs.proxies.EmailCommentNotificationProxy;
import abs.repos.DBCommentRepository;
import abs.services.CommentService;

public class Main {
    public static void main(String[] args) {
/*       var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();
        var commentService = new CommentService(commentRepository, commentNotificationProxy);*/

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
