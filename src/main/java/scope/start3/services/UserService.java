package scope.start3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import scope.start3.repos.CommentRepository;

@Service
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UserService {

    private CommentRepository commentRepository;

    @Autowired

    public UserService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
        System.out.println("创建UserService实例,HashCode:"+this.hashCode());

    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
