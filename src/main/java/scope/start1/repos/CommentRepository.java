package scope.start1.repos;

import scope.start1.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
