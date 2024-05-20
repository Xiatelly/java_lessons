import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        main.testValueCalculator();
        System.out.println();
        main.testConcurrentValueCalculator();
    }

    private void testValueCalculator(){
        ValueCalculator calculator = new ValueCalculator();
        try {
            calculator.calculate();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void testConcurrentValueCalculator() {
        ConcurrentValueCalculator calculator = new ConcurrentValueCalculator();
        try {
            calculator.calculate();
        }
        catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}