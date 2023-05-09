package scope.start4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import scope.start4.Comment;
import scope.start4.process.CommentProcessor;
import scope.start4.repos.CommentRepository;

@Service
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UserService {



    private CommentRepository commentRepository;
    //@Autowired
    //private CommentProcessor p;
    @Autowired
    private ApplicationContext context;
    @Autowired
    public UserService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
        System.out.println("创建UserService实例,HashCode:" + this.hashCode());

    }
    public CommentRepository getCommentRepository() {
        return commentRepository;
    }

    public void sendComment(Comment c){
        var p=context.getBean(CommentProcessor.class);
      //  CommentProcessor p = new CommentProcessor();
        p.setComment(c);
        p.validateComment();
        p.processComment();
        c=p.getComment();
        commentRepository.storeComment(c);
    }

}
