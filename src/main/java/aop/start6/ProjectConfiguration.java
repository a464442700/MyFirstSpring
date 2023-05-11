package aop.start6;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "aop.start6")
@EnableAspectJAutoProxy
public class ProjectConfiguration {
}
