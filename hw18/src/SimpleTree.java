import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SimpleTree<T> {
    private T value;
    private List<SimpleTree<T>> children = new ArrayList<>();

    public T getValue() {
        return value;
    }
    public List<SimpleTree<T>> getChildren() {
        return children;
    }

    public SimpleTree(T value){
        this.value = value;
    }

    public SimpleTree<T> addChild(SimpleTree<T> child){
        children.add(child);
        return child;
    }

    public SimpleTree<T> addChild(T value){
        SimpleTree<T> child = new SimpleTree<>(value);
        return addChild(child);
    }

    public void iterate(Consumer<T> callback){
        callback.accept(value);
        for (SimpleTree<T> child : children){
            child.iterate(callback);
        }
    }
}
