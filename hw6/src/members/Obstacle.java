package members;

public abstract class Obstacle {

    private String name;

    protected Obstacle(String name) {
        this.name = name;
    }

    public float getLength() {
        return 0.0f;
    }

    public float getHeight() {
        return 0.0f;
    }

    public String getName() {
        return name;
    }
}
