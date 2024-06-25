import org.junit.Assert;
import org.junit.Test;
import java.util.concurrent.atomic.AtomicInteger;

public class SimpleTreeTest {
    @Test
    public void test(){
        SimpleTree<Integer> tree0 = new SimpleTree<>(34);
        tree0.addChild(12);
        SimpleTree<Integer> child23 = tree0.addChild(23);
        child23.addChild(22).addChild(18);
        child23.addChild(15);
        tree0.addChild(7);
        AtomicInteger sumResult = new AtomicInteger();
        tree0.iterate(sumResult::addAndGet);
        Assert.assertEquals(131, sumResult.get());
    }
}