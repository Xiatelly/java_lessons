import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<Fruit> fruits = new ArrayList<>();

    public void addFruit(Fruit fruit){
        if (!fruits.isEmpty() && fruit.getClass() != fruits.get(0).getClass())
            throw new IllegalArgumentException(String.format(
                    "Argument Fruit have class: %s, but Box fruits have class: %s",
                    fruit.getClass().getName(),
                    fruits.get(0).getClass().getName()));
        fruits.add(fruit);
    }
}
