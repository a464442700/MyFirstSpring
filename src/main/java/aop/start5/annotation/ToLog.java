package aop.start5.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//表示这个注解可以保留到运行时
@Target(ElementType.METHOD)//该注解只能应用于类中的方法上,比如@Override只能放在方法上面，而不能放在类上面
public @interface ToLog {

}

