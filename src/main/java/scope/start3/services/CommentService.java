package scope.start3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import scope.start3.Comment;
import scope.start3.proxies.CommentNotificationProxy;
import scope.start3.repos.CommentRepository;

@Service//指明是业务逻辑Componet
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    @Qualifier("CommentPushNotificationProxy")
    private CommentNotificationProxy commentNotificationProxy;

    public CommentRepository getCommentRepository(){
        return commentRepository;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
