import java.util.Collections;
import java.util.List;

public class ShakerSort {
    private ShakerSort(){}

    public static <T extends Comparable<? super T>> void sort(List<T> arr) {
        boolean swapped;
        int leftIndex = 0;
        int rightIndex = arr.size() - 1;

        do {
            swapped = false;

            for (int i = leftIndex; i < rightIndex; i++) {
                if (arr.get(i).compareTo(arr.get(i + 1)) > 0) {
                    Collections.swap(arr, i, i + 1);
                    swapped = true;
                }
            }
            rightIndex--;
            for (int i = rightIndex; i > leftIndex; i--) {
                if (arr.get(i).compareTo(arr.get(i - 1)) < 0) {
                    Collections.swap(arr, i, i - 1);
                    swapped = true;
                }
            }
            leftIndex++;
        }
        while (swapped);
    }
}
