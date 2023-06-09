package design.start4;

public class Test {
    public static void main(String[] args) {
        CustomerServiceImpl customerService = new CustomerServiceImpl();

        CustomerService proxy = (CustomerService) LawyerServiceProxyHandler.bind(customerService);
        proxy.goal();
    }
}
