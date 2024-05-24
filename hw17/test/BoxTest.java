import org.junit.Assert;
import org.junit.Test;

public class BoxTest {
    @Test
    public void addFruitTest0() {
        Box box = new Box();
        box.addFruit(new Apple());
        box.addFruit(new Apple());
        box.addFruit(new Apple());
    }

    @Test
    public void addFruitTest1() {
        Box box = new Box();
        box.addFruit(new Apple());
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            box.addFruit(new Orange());
        });
    }

    @Test
    public void addFruitsTest0() {
        Box box = new Box();
        box.addFruits(new Orange(), new Orange(), new Orange(), new Orange());
    }

    @Test
    public void addFruitsTest1() {
        Box box = new Box();
        Assert.assertThrows(IllegalArgumentException.class, () -> {
            box.addFruits(new Orange(), new Apple(), new Orange(), new Apple());
        });
    }

    @Test
    public void calculateFruitsWeightTest0() {
        Box box = new Box();
        box.addFruit(new Apple());
        box.addFruit(new Apple());
        box.addFruit(new Apple());
        Assert.assertEquals(3.0f, box.calculateFruitsWeight(), Float.MIN_VALUE);
    }

    @Test
    public void compareTest0(){
        Box boxA = new Box();
        boxA.addFruits(new Orange(), new Orange(), new Orange(), new Orange());

        Box boxB = new Box();
        boxB.addFruit(new Apple());
        boxB.addFruit(new Apple());
        boxB.addFruit(new Apple());
        boxB.addFruit(new Apple());
        boxB.addFruit(new Apple());
        boxB.addFruit(new Apple());

        Assert.assertTrue(boxA.compare(boxB));
    }

    @Test
    public void mergeTest0(){
        Box boxA = new Box();
        boxA.addFruits(new Orange(), new Orange(), new Orange(), new Orange());

        Box boxB = new Box();
        boxB.addFruits(new Orange(), new Orange());

        boxA.merge(boxB);
        Assert.assertEquals(6, boxA.getFruitsCount());
        Assert.assertEquals(0, boxB.getFruitsCount());
    }

    @Test
    public void mergeTest1(){
        Box boxA = new Box();
        boxA.addFruits(new Apple(), new Apple(), new Apple(), new Apple());

        Box boxB = new Box();
        boxB.addFruits(new Orange(), new Orange());

        Assert.assertThrows(IllegalArgumentException.class, () -> {
            boxA.merge(boxB);
        });
    }
}