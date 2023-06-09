package design.start2;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import java.lang.reflect.Method;


public class LawyerServiceProxyHandler implements MethodInterceptor {
    //模板代码
    public Object getProxy(Class cls) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        System.out.println("当前是CGLIB动态代理");
        System.out.println("律师代替出庭");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("律师讲述客户需求：" + result);
        System.out.println("律师代替追讨经济损失");
        return result;
    }

}