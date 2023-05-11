package aop.start5.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Before(value = "@annotation(aop.start5.annotation.ToLog)")
    public void logBefore(JoinPoint joinPoint) throws Throwable {

        Object[] args = joinPoint.getArgs(); //获取方法参数列表
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod(); //获取被调用方法的Method对象
        String methodName = method.getName(); // 获取被调用方法的名称
        String declaringClassName = method.getDeclaringClass().getName(); //获取被调用方法所在类的名称
        System.out.println("使用@Before注解，" + methodName + "执行前，会自动执行此LoggingAspect.logBefore方法");
    }

    @AfterReturning(value = "@annotation(aop.start5.annotation.ToLog)", returning = "returnValue")
    public void logAfterReturning(JoinPoint joinPoint ,Object returnValue) throws Throwable {

        Object[] args = joinPoint.getArgs(); //获取方法参数列表
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod(); //获取被调用方法的Method对象
        String methodName = method.getName(); // 获取被调用方法的名称
        String declaringClassName = method.getDeclaringClass().getName(); //获取被调用方法所在类的名称
        System.out.println("使用@AfterReturning注解，" + methodName + "执行并返回 \""+returnValue+"\" ，会自动执行此LoggingAspect.logAfterReturning方法");
    }

    @After(value = "@annotation(aop.start5.annotation.ToLog)")
    public void logAfter(JoinPoint joinPoint ) throws Throwable {

        Object[] args = joinPoint.getArgs(); //获取方法参数列表
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod(); //获取被调用方法的Method对象
        String methodName = method.getName(); // 获取被调用方法的名称
        String declaringClassName = method.getDeclaringClass().getName(); //获取被调用方法所在类的名称
        System.out.println("使用After注解，" + methodName + " ，会自动执行此LoggingAspect.logAfter方法");
    }

}