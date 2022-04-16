package StateBalls;

public class TransistionState implements State {

    OrderDeliveryService OrderDeliveryService;
    public TransistionState(OrderDeliveryService OrderDeliveryService) {
        this.OrderDeliveryService = OrderDeliveryService;
    }

    @Override
    public void createOrderService() {
        System.out.println("Order collected to delivery");
        OrderDeliveryService.setState(OrderDeliveryService.getCreateState());
    }

    @Override
    public void acknowledgedOrderService() {
        System.out.println("Order acknowledgement processed");
        OrderDeliveryService.setState(OrderDeliveryService.getAcknowledgedState());
    }

    @Override
    public void shippedOrderService() {
        System.out.println("Order is ready for shipment");
        OrderDeliveryService.setState(OrderDeliveryService.getShippedState());
    }

    @Override
    public void transistionOrderService() {
        System.out.println("Order Transistion haven't initiate so far");
    }

    @Override
    public void poBoxOrderService() {
        System.out.println("Order are haven't reached to P.O Box");
        OrderDeliveryService.setState(OrderDeliveryService.getPoBoxState());
    }

    @Override
    public void outforDeliveryOrderService() {
        System.out.println("Order is not available for out for Delivery");
        OrderDeliveryService.setState(OrderDeliveryService.getOutforDeliveryState());

    }

    @Override
    public void deliveredOrderService() {
        System.out.println("Delay in the Order Delivery");
        OrderDeliveryService.setState(OrderDeliveryService.getDeliveredState());
    }
}