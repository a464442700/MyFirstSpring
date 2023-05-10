package aop.start1.services;

import aop.start1.pojo.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;


@Service
public class CommentService {
    private Logger logger =
            Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {

        System.out.println("123");
        logger.info("Publishing comment:" + comment.getText());
    }
}