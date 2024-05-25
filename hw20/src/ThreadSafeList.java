import java.util.ArrayList;
import java.util.List;

public class ThreadSafeList<T> {
    private List<T> array = new ArrayList<>();
    private final Object lock = new Object();

    public void add(T value){
        synchronized (lock) {
            array.add(value);
        }
    }

    public void remove(int index){
        synchronized (lock) {
            array.remove(index);
        }
    }

    public T get(int index){
        synchronized (lock) {
            return array.get(index);
        }
    }
}
