package UsingAbstract;

import UsingAbstract.model.Comment;
import UsingAbstract.proxies.EmailCommentNotificationProxy;
import UsingAbstract.repos.DBCommentRepository;
import UsingAbstract.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository =
                new DBCommentRepository();
        var commentNotificationProxy =
                new EmailCommentNotificationProxy();
        var commentService =
                new CommentService(
                        commentRepository, commentNotificationProxy);
        var comment = new Comment();
        comment.setAuthor("lxf");
        comment.setText("我的评价是非常好!");
        commentService.publishComment(comment);
    }
}
