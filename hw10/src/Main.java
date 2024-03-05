import coffee.order.CoffeeOrderBoard;
import coffee.order.Order;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.testMain();

    }

    private void testMain(){
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Charlie");
        coffeeOrderBoard.add("Mike");
        coffeeOrderBoard.add("Alex");
        coffeeOrderBoard.add("Dima");
        coffeeOrderBoard.add("Lord");
        coffeeOrderBoard.draw();
        System.out.println();

        coffeeOrderBoard.deliver();
        coffeeOrderBoard.draw();
        System.out.println();

        coffeeOrderBoard.deliver(4);
        coffeeOrderBoard.draw();
        System.out.println();

        coffeeOrderBoard.deliver(7);
        coffeeOrderBoard.draw();
        System.out.println();
    }
}