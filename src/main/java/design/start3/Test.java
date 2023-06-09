package design.start3;

public class Test {
    public static void main(String[] args) {
        CustomerServiceImpl customerService1 = new CustomerServiceImpl(false);
        CustomerServiceImpl customerService2 = new CustomerServiceImpl(true);

        CustomerService proxy1 = (CustomerService) LawyerServiceProxyHandler.bind(customerService1);
        proxy1.goal();
        CustomerService proxy2 = (CustomerService) LawyerServiceProxyHandler.bind(customerService2);
        proxy2.goal();
    }
}
