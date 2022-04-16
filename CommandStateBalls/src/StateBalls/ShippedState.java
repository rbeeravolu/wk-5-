package StateBalls;

public class ShippedState implements State {

    OrderDeliveryService orderDeliveryService;
    public ShippedState(OrderDeliveryService orderDeliveryService) {
        this.orderDeliveryService = orderDeliveryService;
    }

    @Override
    public void createOrderService() {
        System.out.println("Created Order Service Request");
        orderDeliveryService.setState(orderDeliveryService.getCreateState());
    }

    @Override
    public void acknowledgedOrderService() {
        System.out.println("Order is collected");
        orderDeliveryService.setState(orderDeliveryService.getAcknowledgedState());

    }

    @Override
    public void shippedOrderService() {
        System.out.println("Order not received for shipment");
    }

    @Override
    public void transistionOrderService() {
        System.out.println("Order is not moving to Transistion");
        orderDeliveryService.setState(orderDeliveryService.getTransistionState());

    }

    @Override
    public void poBoxOrderService() {
        System.out.println("Order wont be in P.O Box");
        orderDeliveryService.setState(orderDeliveryService.getPoBoxState());
    }

    @Override
    public void outforDeliveryOrderService() {
        System.out.println("Order is not ready to out for Delivery");
        orderDeliveryService.setState(orderDeliveryService.getOutforDeliveryState());

    }

    @Override
    public void deliveredOrderService() {
        System.out.println("Order had issue to Delivery");
        orderDeliveryService.setState(orderDeliveryService.getDeliveredState());
    }
}
