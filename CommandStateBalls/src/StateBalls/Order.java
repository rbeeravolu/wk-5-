package StateBalls;

public interface Order {
    Order Name();
    Order IDSNumber();
    Order POBoxNumber();
    OrderDeliveryService build();
}