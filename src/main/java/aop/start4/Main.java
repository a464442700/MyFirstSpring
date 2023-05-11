package aop.start4;

import aop.start4.pojo.Comment;
import aop.start4.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("lxf");
        comment.setText("AOP非常好");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
        commentService.deleteComment(comment);
        commentService.editComment(comment);

    }
}
