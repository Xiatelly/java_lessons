public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.valueCalculatorTest();
    }

    private void valueCalculatorTest(){
        ValueCalculator calculator = new ValueCalculator();
        try {
            calculator.calculate();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}