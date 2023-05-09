package scope.start1.repos;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import scope.start1.model.Comment;

@Repository//此注解表示此服务是一个DAO，是一种特殊的@Component
public class DBCommentRepository implements CommentRepository {

    @Override
    public void storeComment(Comment comment){
        System.out.println("存储评论: " + comment.getText());
    }
}
