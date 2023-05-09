package scope.start1.proxies;

import scope.start1.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
