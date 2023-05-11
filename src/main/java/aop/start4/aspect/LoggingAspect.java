package aop.start4.aspect;

import aop.start4.pojo.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;


@Component
@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(aop.start4.annotation.ToLog)")//表示添加了ToLog注解的方法会自动执行log方法
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("ToLog注解的方法" + methodName + "会自动执行此LoggingAspect.log方法");
        joinPoint.proceed();
    }

}