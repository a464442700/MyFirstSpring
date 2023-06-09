package design.start4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//代理类
public class LawyerServiceProxyHandler implements InvocationHandler {

    private Object target;

    public LawyerServiceProxyHandler(Object targer) {
        this.target = targer;
    }

    public static Object bind(Object target) {

        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new LawyerServiceProxyHandler(target)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("律师代替出庭");
        Object result = method.invoke(target, args);//
        System.out.println("律师讲述客户需求：" + result);
        System.out.println("律师代替追讨经济损失");
        return result;
    }
}