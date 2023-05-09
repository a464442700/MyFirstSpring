package scope.start2.repos;

import org.springframework.stereotype.Repository;
import scope.start2.Comment;

@Repository//此注解表示此服务是一个DAO，是一种特殊的@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment){
        System.out.println("存储评论: " + comment.getText());
    }

    public  DBCommentRepository(){
        System.out.println("创建DBCommentRepository实例");
    }
}
