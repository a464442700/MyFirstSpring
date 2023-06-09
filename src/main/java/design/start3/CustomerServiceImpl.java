package design.start3;

public class CustomerServiceImpl implements CustomerService {
    public Boolean quality;
    @Override
    public String goal() {
        return "客户诉求赔偿1000块钱";
    }
    public CustomerServiceImpl( Boolean quality){
        this.quality=quality;
    }
}
