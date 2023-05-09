package scope.start1.proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import scope.start1.model.Comment;

@Component
@Qualifier("EmailCommentNotificationProxy")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("为评论发送邮件: "
                + comment.getText());
    }
}
