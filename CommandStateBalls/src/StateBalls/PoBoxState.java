package StateBalls;

public class PoBoxState implements State {

    OrderDeliveryService orderDeliveryService;
    public PoBoxState(OrderDeliveryService orderDeliveryService) {
        this.orderDeliveryService = orderDeliveryService;
    }

    @Override
    public void createOrderService() {
        System.out.println("Order Service Request processed");
        orderDeliveryService.setState(orderDeliveryService.getCreateState());
    }

    @Override
    public void acknowledgedOrderService() {
        System.out.println("Order received");
        orderDeliveryService.setState(orderDeliveryService.getAcknowledgedState());
    }

    @Override
    public void shippedOrderService() {
        System.out.println("Order is now shipped");
        orderDeliveryService.setState(orderDeliveryService.getShippedState());
    }

    @Override
    public void transistionOrderService() {
        System.out.println("Order moved for Transistion");
        orderDeliveryService.setState(orderDeliveryService.getTransistionState());

    }

    @Override
    public void poBoxOrderService() {
        System.out.println("Order is not received at P.O Box");
    }

    @Override
    public void outforDeliveryOrderService() {
        System.out.println("Order is not available to out for Delivery");
        orderDeliveryService.setState(orderDeliveryService.getOutforDeliveryState());
    }

    @Override
    public void deliveredOrderService() {
        System.out.println("Order is not going to Deliver");
        orderDeliveryService.setState(orderDeliveryService.getDeliveredState());
    }
}
