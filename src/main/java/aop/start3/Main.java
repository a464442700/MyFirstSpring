package aop.start3;

import aop.start2.aspect.LoggingAspect;
import aop.start3.pojo.Comment;
import aop.start3.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("lxf");
        comment.setText("AOP非常好");

        var commentService = context.getBean(CommentService.class);
        var value= commentService.publishComment(comment);
        System.out.println(value);

    }
}
