package aop.start5.services;

import aop.start5.annotation.ToLog;
import aop.start5.pojo.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());
    public void publishComment(Comment comment) {
       // logger.info("Publishing comment:" + comment.getText());
    }

    public void deleteComment(Comment comment) {
       // logger.info("Deleting comment:" + comment.getText());
        System.out.println("删除评论");
    }
    @ToLog
    public String editComment(Comment comment) {
      //  logger.info("Editing comment:" + comment.getText());
        System.out.println("编辑评论");
        return "编辑成功";
    }
}