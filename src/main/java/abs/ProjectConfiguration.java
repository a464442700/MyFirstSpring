package abs;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import abs.proxies.EmailCommentNotificationProxy;
import abs.repos.DBCommentRepository;
import abs.services.CommentService;

@Configuration
//@ComponentScan(basePackageClasses = {CommentService.class, EmailCommentNotificationProxy.class, DBCommentRepository.class})
@ComponentScan(basePackages = "abs")
public class ProjectConfiguration {
}
