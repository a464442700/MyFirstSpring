package aop.start3.services;

import aop.start3.pojo.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;


@Service
public class CommentService {
    private Logger logger =
            Logger.getLogger(CommentService.class.getName());

    public String  publishComment(Comment comment) {
        logger.info("发布评论:" + comment.getText());
        return  "Success";
    }
}