package members;

public class Wall extends Obstacle{
    private float height = 0.0f;

    public Wall(float height) {
        super("wall");
        this.height = height;
    }

    @Override
    public float getHeight() {
        return height;
    }
}
