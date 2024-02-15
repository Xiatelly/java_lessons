package figures;

public class Triangle implements IFigure {
    private float sideA= 0.0f;
    private float sideB = 0.0f;
    private float sideC = 0.0f;

    public Triangle(float a, float b, float c){
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    @Override
    public float square() {
        float p = (sideA + sideB + sideC) * 0.5f;
        return  (float) Math.sqrt(p *
                        (p - sideA) *
                        (p - sideB) *
                        (p - sideC));
    }
}
