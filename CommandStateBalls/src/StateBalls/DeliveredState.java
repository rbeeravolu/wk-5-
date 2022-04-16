package StateBalls;

public class DeliveredState implements State {

    OrderDeliveryService orderDeliveryService;
    public DeliveredState(OrderDeliveryService orderDeliveryService) {
        this.orderDeliveryService = orderDeliveryService;
    }

    @Override
    public void createOrderService() {
        System.out.println("Orders are gathered together");
        orderDeliveryService.setState(orderDeliveryService.getCreateState());
    }

    @Override
    public void acknowledgedOrderService() {
        System.out.println("Orders acknowledged");
        orderDeliveryService.setState(orderDeliveryService.getAcknowledgedState());
    }

    @Override
    public void shippedOrderService() {
        System.out.println("Order shipment initiated");
        orderDeliveryService.setState(orderDeliveryService.getShippedState());
    }

    @Override
    public void transistionOrderService() {
        System.out.println("Orders Transistion initiated");
        orderDeliveryService.setState(orderDeliveryService.getTransistionState());
    }

    @Override
    public void poBoxOrderService() {
        System.out.println("Orders available in P.O Box");
        orderDeliveryService.setState(orderDeliveryService.getPoBoxState());
    }

    @Override
    public void outforDeliveryOrderService() {
        System.out.println("Order is out for Delivery");
        orderDeliveryService.setState(orderDeliveryService.getOutforDeliveryState());
    }

    @Override
    public void deliveredOrderService() {
        System.out.println("Order is not Delivered");
    }
}