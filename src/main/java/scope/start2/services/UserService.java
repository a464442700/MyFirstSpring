package scope.start2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import scope.start2.repos.CommentRepository;

@Service
@Lazy
public class UserService {

    private final CommentRepository commentRepository;

    @Autowired

    public UserService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
        System.out.println("创建UserService实例");
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
