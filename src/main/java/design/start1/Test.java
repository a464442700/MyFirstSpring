package design.start1;

public class Test {
    public static void main(String[] args) {
        CustomerServiceImpl helloService = new CustomerServiceImpl();
        LawyerServiceProxyHandler proxyHandler = new LawyerServiceProxyHandler();
        CustomerService proxy = (CustomerService) proxyHandler.bind(helloService);
        proxy.goal();
    }
}
