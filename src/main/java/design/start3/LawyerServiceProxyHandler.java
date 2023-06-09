package design.start3;

import java.lang.reflect.Field;
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

    private boolean before(){
        Field field = null;
        Boolean quality = null;
        try {
            field  = target.getClass().getDeclaredField("quality");
            quality= (Boolean) field.get(target);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return  false;
        }


        if (quality){
            System.out.println("审核通过");
            return true;
        }else{
            System.out.println("审核失败");
            return false;
        }

    }

    private void after(){
        System.out.println("律师代替追讨经济损失");
    }

    @Override
    public Object  invoke(Object proxy, Method method, Object[] args) throws Throwable {
       if (before()){
           Object result = method.invoke(target, args);
           System.out.println(result);
           after();
        }

       return  null;
    }
}