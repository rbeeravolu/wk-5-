package StateBalls;

public class CreateState implements State {

    OrderDeliveryService orderDeliveryService;
    public CreateState(OrderDeliveryService orderDeliveryService) {
        this.orderDeliveryService = orderDeliveryService;
    }

    @Override
    public void createOrderService() {
        System.out.println("Creating a Order Service Request");
    }

    @Override
    public void acknowledgedOrderService() {
        System.out.println("Order is received");
        orderDeliveryService.setState(orderDeliveryService.getAcknowledgedState());
    }

    @Override
    public void shippedOrderService() {
        System.out.println("Order is now shipped");
        orderDeliveryService.setState(orderDeliveryService.getShippedState());
    }

    @Override
    public void transistionOrderService() {
        System.out.println("Order is in Transistion");
        orderDeliveryService.setState(orderDeliveryService.getTransistionState());
    }

    @Override
    public void poBoxOrderService() {
        System.out.println("Order is available now in P.O Box");
        orderDeliveryService.setState(orderDeliveryService.getPoBoxState());
    }

    @Override
    public void outforDeliveryOrderService() {
        System.out.println("Order is out for Delivery");
        orderDeliveryService.setState(orderDeliveryService.getOutforDeliveryState());
    }

    @Override
    public void deliveredOrderService() {
        System.out.println("Order is Delivered");
        orderDeliveryService.setState(orderDeliveryService.getDeliveredState());
    }
}