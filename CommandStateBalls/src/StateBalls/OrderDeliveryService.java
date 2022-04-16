package StateBalls;

public class OrderDeliveryService
{
    AcknowledgedState acknowledgedState;
    ShippedState shippedState;
    TransistionState transistionState;
    PoBoxState poBoxState;
    OutforDeliveryState outforDeliveryState;
    DeliveredState deliveredState;
    CreateState createState;
    State state;

    OrderDeliveryService()
    {
        acknowledgedState = new AcknowledgedState(this);
        shippedState= new ShippedState(this);
        transistionState = new TransistionState(this);
        poBoxState = new PoBoxState(this);
        outforDeliveryState = new OutforDeliveryState(this);
        deliveredState = new DeliveredState(this);
        createState=new CreateState(this);
        state=createState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public AcknowledgedState getAcknowledgedState() {
        return acknowledgedState;
    }

    public ShippedState getShippedState() {
        return shippedState;
    }

    public TransistionState getTransistionState() {
        return transistionState;
    }

    public PoBoxState getPoBoxState() {
        return poBoxState;
    }

    public OutforDeliveryState getOutforDeliveryState() {
        return outforDeliveryState;
    }

    public DeliveredState getDeliveredState() {
        return deliveredState;
    }

    public CreateState getCreateState() {
        return createState;
    }

    public void createOrderService()  {
        state.createOrderService();
    }

    public void acknowledgedOrderService()  {
        state.acknowledgedOrderService();
    }

    public void shippedOrderService() {
        state.shippedOrderService();
    }

    public void transistionOrderService() {
        state.transistionOrderService();
    }

    public void poBoxOrderService()  {
        state.poBoxOrderService();
    }

    public void outforDeliveryOrderService() {
        state.outforDeliveryOrderService();
    }

    public void deliveredOrderService() {
        state.deliveredOrderService();
    }

    public String toString() {
        StringBuffer sbuffer=new StringBuffer();
        sbuffer.append("\nOrderService State  \nOrder "+state);
        return sbuffer.toString();
    }
}