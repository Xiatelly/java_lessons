package members;

public class RunningTrack extends Obstacle {
    private float length = 0.0f;

    public RunningTrack(float length) {
        super("running track");
        this.length = length;
    }

    @Override
    public float getLength() {
        return length;
    }
}
