import java.util.Collections;
import java.util.List;

public final class QuickSort {

    private QuickSort(){}

    public static <T extends Comparable<? super T>> void sort(List<T> arr) {
        sort(arr, 0, arr.size() - 1);
    }

    private static <T extends Comparable<? super T>> void sort(List<T> arr, int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int partitionIndex = partition(arr, lowerIndex, higherIndex);
            sort(arr, lowerIndex, partitionIndex - 1);
            sort(arr, partitionIndex + 1, higherIndex);
        }
    }

    private static <T extends Comparable<? super T>> int partition(List<T> arr, int lowerIndex, int higherIndex) {
        T pivot = arr.get(higherIndex);
        int i = lowerIndex - 1;

        for (int j = lowerIndex; j < higherIndex; j++) {
            if (arr.get(j).compareTo(pivot) < 0) {
                i++;
                Collections.swap(arr, i, j);
            }
        }

        Collections.swap(arr, i + 1, higherIndex);
        return i + 1;
    }
}
