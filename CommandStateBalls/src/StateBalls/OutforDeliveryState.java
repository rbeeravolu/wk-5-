package StateBalls;

public class OutforDeliveryState implements State {

    OrderDeliveryService orderDeliveryService;
    public OutforDeliveryState(OrderDeliveryService orderDeliveryService) {
        this.orderDeliveryService = orderDeliveryService;
    }

    @Override
    public void createOrderService() {
        System.out.println("Order Service Request initiated");
        orderDeliveryService.setState(orderDeliveryService.getCreateState());
    }

    @Override
    public void acknowledgedOrderService() {
        System.out.println("Order is collected");
        orderDeliveryService.setState(orderDeliveryService.getAcknowledgedState());

    }

    @Override
    public void shippedOrderService() {
        System.out.println("Order available at shippment");
        orderDeliveryService.setState(orderDeliveryService.getShippedState());
    }

    @Override
    public void transistionOrderService() {
        System.out.println("Order is on the way for transistion");
        orderDeliveryService.setState(orderDeliveryService.getTransistionState());
    }

    @Override
    public void poBoxOrderService() {
        System.out.println("Order moved to P.O Box");
        orderDeliveryService.setState(orderDeliveryService.getPoBoxState());
    }

    @Override
    public void outforDeliveryOrderService() {
        System.out.println("Order not moved to out for Delivery");
    }

    @Override
    public void deliveredOrderService() {
        System.out.println("Order is having issue to Deliver");
        orderDeliveryService.setState(orderDeliveryService.getDeliveredState());
    }
}