package coffee.order;

public class Order {

    private int orderID;
    private String name;

    public Order(int orderID, String name){
        this.orderID = orderID;
        this.name = name;
    }

    public int getOrderId() {
        return orderID;
    }

    public String getName() {
        return name;
    }
}
