public class Animal {
    private static int sAnimalsCounter = 0;

    protected String mName;
    protected float mRunLimit = 0.0f;
    protected float mSwimLimit = 0.0f;

    public static void printAnimalsCount(){
        System.out.print("Animals count: ");
        System.out.println(sAnimalsCounter);
    }

    protected Animal(String name){
        mName = name;
        sAnimalsCounter++;
    }

    public void run(float distance){
        if (distance <= mRunLimit){
            System.out.printf("%s ran %.1f meters%n", mName, distance);
        }
        else {
            System.out.printf(
                    "%s couldn't ran %.1f meters (ran: %.1f meters, left: %.1f meters)%n",
                    mName,
                    distance,
                    mRunLimit,
                    distance - mRunLimit);
        }
    }

    public void swim(float distance){
        if (distance <= mSwimLimit){
            System.out.printf("%s swam %.1f meters%n", mName, distance);
        }
        else {
            System.out.printf(
                    "%s couldn't swam %.1f meters (swam: %.1f meters, left: %.1f meters)%n",
                    mName,
                    distance,
                    mSwimLimit,
                    distance - mSwimLimit);
        }
    }
}
