import org.junit.Test;

public class ThreadSafeListTest {
    @Test
    public void testRemoveFromArrayByIndex(){
        ThreadSafeList<Integer> test0 = new ThreadSafeList<>();
        test0.add(42);
        test0.add(43);
        test0.add(44);
        test0.add(45);
        test0.add(46);
        test0.add(47);
        test0.remove(2);
        for (int i = 0; i < test0.size(); i++){
            System.out.printf("[%d] = %d%n", i, test0.get(i));
        }

    }
}