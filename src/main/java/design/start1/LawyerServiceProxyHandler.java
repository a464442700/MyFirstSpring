package design.start1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//代理类
public class LawyerServiceProxyHandler implements InvocationHandler {
    //被代理对象,某个客户
    private Object target;

    //被代理对象的所有接口方法交给代理对象，代理对象就是这个HelloServiceProxyHandler
    //返回一个新的绑定了被代理对象方法的对象
    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
    //proxy:代理对象 如律师
    //method:被代理对象 如客户
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("律师代替出庭");
        Object result = method.invoke(target, args);//
        System.out.println("律师讲述客户需求："+result);
        System.out.println("律师代替追讨经济损失");
        return result;
    }
}