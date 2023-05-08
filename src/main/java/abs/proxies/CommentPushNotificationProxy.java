package abs.proxies;

import abs.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CommentPushNotificationProxy")
public class CommentPushNotificationProxy
        implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println(
                "为评论发送通知: "
                        + comment.getText());
    }
}