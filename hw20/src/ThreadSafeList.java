public class ThreadSafeList<T> {
    private Object[] array;
    private final Object lock = new Object();

    public int size(){
        synchronized (lock) {
            if (array != null)
                return array.length;
            return 0;
        }
    }

    public void add(T value){
        synchronized (lock) {
            int newSize = size() + 1;
            Object[] newArray = new Object[newSize];
            if (array != null)
                System.arraycopy(array, 0, newArray, 0, size());

            array = newArray;
            array[size() - 1] = value;
        }
    }

    public void remove(int index){
        synchronized (lock) {
            if (index < 0 || index >= size())
                throw new ArrayIndexOutOfBoundsException();

            int newSize = size() - 1;
            if (newSize == 0) {
                array = null;
                return;
            }
            Object[] newArray = new Object[newSize];
            for (int i = 0; i < array.length; i++){
                if (index == i) {
                    continue;
                }

                newArray[i < index ? i : i - 1] = array[i];
            }
            array = newArray;
        }
    }

    public T get(int index){
        synchronized (lock) {
            if (index < 0 || index >= size())
                throw new ArrayIndexOutOfBoundsException();
            return (T) array[index];
        }
    }
}
