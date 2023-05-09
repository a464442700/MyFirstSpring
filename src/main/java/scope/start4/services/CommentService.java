package scope.start4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import scope.start4.Comment;
import scope.start4.proxies.CommentNotificationProxy;
import scope.start4.repos.CommentRepository;

@Service//指明是业务逻辑Componet
@Lazy
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
