package scope.start4.repos;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import scope.start4.Comment;

@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Repository//此注解表示此服务是一个DAO，是一种特殊的@Component
@Lazy
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment){
        System.out.println("存储评论: " + comment.getText());
    }

    public  DBCommentRepository(){
        System.out.println("创建DBCommentRepository实例,HashCode:"+this.hashCode());
    }
}
