package figures;

public class Square implements Figure {
    private float side = 0.0f;

    public Square (float side){
        this.side = side;
    }

    @Override
    public float square() {
        return  side * side;
    }
}
