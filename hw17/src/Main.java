import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.testGenerics0();
        main.testFruitBox();
    }

    private void testGenerics0(){
        String[] array0 = {"A", "B", "C", "D", "E"};
        List<String> newList0 = GenericTests.toList(array0);
        System.out.println(newList0);

        Integer[] array1 = {0, 1, 2, 3, 4, 5, 6};
        List<Integer> newList1 = GenericTests.toList(array1);
        System.out.println(newList1);
    }

    private void testFruitBox(){
        Box firstBox = new Box();
        try {
            firstBox.addFruit(new Apple());
            firstBox.addFruit(new Orange());
        }
        catch(Exception e){
            System.err.printf("Failed to add fruit: %s", e.getMessage());
        }


    }
}