import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.testGenerics0();
    }

    private void testGenerics0(){
        String[] array0 = {"A", "B", "C", "D", "E"};
        List<String> newList0 = GenericTests.toList(array0);
        System.out.println(newList0);

        Integer[] array1 = {0, 1, 2, 3, 4, 5, 6};
        List<Integer> newList1 = GenericTests.toList(array1);
        System.out.println(newList1);
    }
}