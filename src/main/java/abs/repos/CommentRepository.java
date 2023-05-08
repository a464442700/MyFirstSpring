package abs.repos;

import abs.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
