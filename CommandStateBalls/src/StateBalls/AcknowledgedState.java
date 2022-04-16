package StateBalls;

public class AcknowledgedState implements State{

    OrderDeliveryService OrderDeliveryService;
    public AcknowledgedState(OrderDeliveryService OrderDeliveryService) {
        this.OrderDeliveryService = OrderDeliveryService;
    }

    @Override
    public void createOrderService() {
        System.out.println("Orders are gathered together");
        OrderDeliveryService.setState(OrderDeliveryService.getCreateState());
    }

    @Override
    public void acknowledgedOrderService() {
        System.out.println("Orders haven't received acknowledgement");
    }

    @Override
    public void shippedOrderService() {
        System.out.println("Order is now available for shipment");
        OrderDeliveryService.setState(OrderDeliveryService.getShippedState());
    }

    @Override
    public void transistionOrderService() {
        System.out.println("Orders Transistion not initiated");
        OrderDeliveryService.setState(OrderDeliveryService.getTransistionState());
    }

    @Override
    public void poBoxOrderService() {
        System.out.println("Orders are now not taken into P.O Box");
        OrderDeliveryService.setState(OrderDeliveryService.getPoBoxState());
    }

    @Override
    public void outforDeliveryOrderService() {
        System.out.println("Order is not reached here for out for Delivery");
        OrderDeliveryService.setState(OrderDeliveryService.getOutforDeliveryState());

    }

    @Override
    public void deliveredOrderService() {
        System.out.println("Order is not available to Deliver");
        OrderDeliveryService.setState(OrderDeliveryService.getDeliveredState());
    }
}