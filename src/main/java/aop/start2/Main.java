package aop.start2;

import aop.start2.pojo.Comment;
import aop.start2.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class Main {


    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("lxf");
        comment.setText("AOP非常好");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
