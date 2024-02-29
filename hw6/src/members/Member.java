package members;

public abstract class Member {
    private String name;
    private float jumpLimit;
    private float runLimit;

    protected Member(String name,
                     float jumpLimit,
                     float runLimit){
        this.name = name;
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }

    public String getName() {
        return name;
    }

    public boolean jump( float distance){
        if (distance <= jumpLimit){
            System.out.printf("%s jumped %.1f meters%n", name, distance);
            return true;
        }

        System.out.printf(
                "%s couldn't jump %.1f meters (jumped: %.1f meters, left: %.1f meters)%n",
                name,
                distance,
                jumpLimit,
                distance - jumpLimit);
        return false;
    }

    public boolean run(float distance){
        if (distance <= runLimit){
            System.out.printf("%s ran %.1f meters%n", name, distance);
            return true;
        }

        System.out.printf(
                "%s couldn't run %.1f meters (ran: %.1f meters, left: %.1f meters)%n",
                name,
                distance,
                runLimit,
                distance - runLimit);
        return false;
    }

    public boolean overcome(Obstacle obstacle){
        float obstacleLength = obstacle.getLength();
        if (obstacleLength > 0.0f){
            if (run(obstacleLength)) {
                System.out.printf("%s overcame %s.%n", name, obstacle.getName());
            }
            else {
                System.out.printf("%s couldn't overcome %s.%n", name, obstacle.getName());
                return false;
            }
        }

        float obstacleHeight = obstacle.getHeight();
        if (obstacleHeight > 0.0f){
            if (jump(obstacleHeight)) {
                System.out.printf("%s overcame %s.%n", name, obstacle.getName());
            }
            else {
                System.out.printf("%s couldn't overcome %s.%n", name, obstacle.getName());
                return false;
            }
        }
        return true;
    }
}
