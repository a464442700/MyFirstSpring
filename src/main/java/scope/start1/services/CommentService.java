package scope.start1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import scope.start1.model.Comment;
import scope.start1.proxies.CommentNotificationProxy;
import scope.start1.repos.CommentRepository;

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
