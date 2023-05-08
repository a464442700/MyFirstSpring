package abs.services;

import abs.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import abs.proxies.CommentNotificationProxy;
import abs.repos.CommentRepository;

@Component
public class CommentService {
//    private final CommentRepository commentRepository;
//    private final CommentNotificationProxy commentNotificationProxy;
//
//    @Autowired//此注释方便DI
//    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy){
//        this.commentRepository = commentRepository;
//        this.commentNotificationProxy = commentNotificationProxy;
//
//    }
   @Autowired
   private  CommentRepository commentRepository;
   @Autowired
   private  CommentNotificationProxy commentNotificationProxy;
    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
