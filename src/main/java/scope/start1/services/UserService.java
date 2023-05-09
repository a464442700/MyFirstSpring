package scope.start1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scope.start1.repos.CommentRepository;

@Service
public class UserService {
    @Autowired
    private CommentRepository commentRepository;
    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
