package aop.start3.aspect;

import aop.start3.pojo.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
//    @Around("execution(* aop.start3.services.*.*(..))")
//    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
//        String methodName =
//                joinPoint.getSignature().getName();
//        Object [] arguments = joinPoint.getArgs();
//        logger.info("Method " + methodName +
//                " with parameters " + Arrays.asList(arguments) +
//                " will execute");
//        Object returnedByMethod = joinPoint.proceed();
//        logger.info("Method executed and returned " + returnedByMethod);
//        return returnedByMethod;
//    }

    @Around("execution(* aop.start3.services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object [] arguments = joinPoint.getArgs();
        logger.info("Method " + methodName +
                " with parameters " + Arrays.asList(arguments) +
                " will execute");
        Comment comment = new Comment();
        comment.setText("AOP不行");
        Object [] newArguments = {comment};
        Object returnedByMethod = joinPoint.proceed(newArguments);
        logger.info("Method executed and returned " + returnedByMethod);
        return "FAILED";
    }

}