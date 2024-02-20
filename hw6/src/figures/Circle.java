package figures;

public class Circle implements Figure {
    private float radius = 0.0f;

    public Circle(float radius){
        this.radius = radius;
    }

    @Override
    public float square() {
        return (float) Math.PI * radius * radius;
    }
}
