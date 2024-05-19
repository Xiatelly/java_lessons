import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.testQuickSort();
        main.testShakerSort();
    }

    private void testQuickSort(){
        List<Integer> arr = Arrays.asList(7, 2, 1, 6, 8, 5, 3, 4);
        System.out.println("Quick sort test:");
        System.out.println(arr);
        QuickSort.sort(arr);
        System.out.println("Sorted arr:");
        System.out.println(arr);
    }

    private void testShakerSort(){
        List<Integer> arr = Arrays.asList(7, 2, 1, 6, 8, 5, 3, 4);
        System.out.println("Shaker sort test:");
        System.out.println(arr);
        ShakerSort.sort(arr);
        System.out.println("Sorted arr:");
        System.out.println(arr);
    }
}