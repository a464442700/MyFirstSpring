package scope.start4.proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import scope.start4.Comment;

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