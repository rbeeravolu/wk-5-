package StateBalls;

public class OrderServiceBuilder implements Order{

    public OrderServiceBuilder(){

    }

    @Override
    public Order Name() {
        System.out.println();
        System.out.println();
        System.out.println("--------Order Service is initiated for the person-------");
        return this;
    }

    @Override
    public Order IDSNumber() {
        System.out.println("Order Service is initiated with this IDSNumber");
        return this;
    }

    @Override
    public Order POBoxNumber() {
        System.out.println("Order Service is for the particular POBox");
        return this;
    }

    @Override
    public OrderDeliveryService build() {
        OrderDeliveryService ps=new OrderDeliveryService();
        System.out.println("=====Order Service initiated=====");
        return ps;
    }
}