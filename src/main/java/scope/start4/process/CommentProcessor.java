package scope.start4.process;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import scope.start4.Comment;
@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {
    private Comment comment;

    public  CommentProcessor(){
        System.out.println("创建CommentProcessor实例，HashCode"+this.hashCode());
    }
    public void setComment(Comment comment) {
        this.comment = comment;
    }
    public Comment getComment() {
        return this.comment;
    }
    public void processComment() {
        System.out.println("CommentProcessor处理评论");
    }
    public void validateComment() {
        System.out.println("CommentProcessor验证评论");
    }
}
