package aop.start3;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "aop.start3")
@EnableAspectJAutoProxy
public class ProjectConfiguration {
}
