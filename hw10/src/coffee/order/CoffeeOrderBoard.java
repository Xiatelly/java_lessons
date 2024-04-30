package coffee.order;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
    private Queue<Order> orders = new LinkedList<>();
    private int orderCounter;

    public void add(String name){
        orders.add(new Order(++orderCounter, name));
    }

    public void draw(){
        System.out.println("Order state:");
        for (Order order : orders)
            System.out.printf("ID: %d| Name: %s%n", order.getOrderId(), order.getName());
    }

    public void deliver(){
        Order order = orders.peek();
        if (order == null){
            System.out.println("there are no orders right now");
            return;
        }
        System.out.printf("Order for %s is ready (%d)%n", order.getName(), order.getOrderId());
        orders.poll();
    }

    public void deliver(int orderId){
        boolean processed = false;
        for (Order order : orders){
            if (order.getOrderId() == orderId){
                System.out.printf(
                        "Order for %s is ready (%d)%n",
                        order.getName(),
                        order.getOrderId());
                orders.remove(order);
                processed = true;
                break;
            }
        }

        if (!processed)
            System.out.printf("Order with id: %d is not found %n", orderId);
    }
}
