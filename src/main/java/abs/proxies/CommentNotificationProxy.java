package abs.proxies;

import abs.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
