import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<Fruit> fruits = new ArrayList<>();

    public void addFruit(Fruit fruit){
        if (!fruits.isEmpty() && fruit.getClass() != getFruitClass())
            throw new IllegalArgumentException(String.format(
                    "Argument Fruit have class: %s, but Box fruits have class: %s",
                    fruit.getClass().getName(),
                    getFruitClass().getName()));
        fruits.add(fruit);
    }

    public Class<?> getFruitClass(){
        if (fruits.isEmpty())
            return null;
        return fruits.get(0).getClass();
    }

    public void addFruits(Fruit... fruits){
        for (Fruit fruit : fruits){
            addFruit(fruit);
        }
    }

    public float calculateFruitsWeight(){
        if (fruits.isEmpty())
            return 0.0f;
        return fruits.get(0).getWeight() * fruits.size();
    }

    public boolean compare(Box other){
        float currentWeight = calculateFruitsWeight();
        float otherWeight = other.calculateFruitsWeight();
        return (Math.abs(currentWeight - otherWeight) <= Float.MIN_VALUE);
    }

    public void merge(Box other){
        if (!fruits.isEmpty() && other.getFruitClass() != getFruitClass())
            throw new IllegalArgumentException(String.format(
                    "Argument other Box fruits have class: %s, but current Box fruits have class: %s",
                    other.getFruitClass().getName(),
                    getFruitClass().getName()));

        fruits.addAll(other.fruits);
        other.fruits.clear();
    }

    public int getFruitsCount(){
        return fruits.size();
    }
}
