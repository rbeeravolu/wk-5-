package StateBalls;
public interface State
{
    public abstract void createOrderService();
    public abstract void acknowledgedOrderService();
    public abstract void shippedOrderService();
    public abstract void transistionOrderService();
    public abstract void poBoxOrderService();
    public abstract void outforDeliveryOrderService();
    public abstract void deliveredOrderService();
}
