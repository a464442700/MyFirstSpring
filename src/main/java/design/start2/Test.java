package design.start2;

import design.start1.CustomerService;

public class Test {
    public static void main(String[] args) {

        LawyerServiceProxyHandler proxyHandler = new LawyerServiceProxyHandler();//生成代理对象
        Customer customer = (Customer)proxyHandler.getProxy(Customer.class) ;//代理对象绑定目标对象
        customer.goal();
    }
}
