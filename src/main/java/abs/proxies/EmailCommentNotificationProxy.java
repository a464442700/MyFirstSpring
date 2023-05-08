package abs.proxies;

import abs.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("为评论发送邮件: "
                + comment.getText());
    }
}
