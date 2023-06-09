package design.start1;

public class Test {
    public static void main(String[] args) {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        LawyerServiceProxyHandler proxyHandler = new LawyerServiceProxyHandler();
        CustomerService proxy = (CustomerService) proxyHandler.bind(customerService);
        proxy.goal();
    }
}
