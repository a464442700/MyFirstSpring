package UsingAbstract.repos;

import UsingAbstract.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
