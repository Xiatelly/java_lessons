public class Animal {
    private static int sAnimalsCounter = 0;

    protected String Name;
    protected float RunLimit = 0.0f;
    protected float SwimLimimt = 0.0f;

    public static void printAnimalsCount(){
        System.out.print("Animals count: ");
        System.out.println(sAnimalsCounter);
    }

    protected Animal(String name){
        Name = name;
        sAnimalsCounter++;
    }

    public void run(float distance){
        if (distance <= RunLimit){
            System.out.printf("%s ran %.1f meters%n", Name, distance);
        }
        else {
            System.out.printf(
                    "%s couldn't ran %.1f meters (ran: %.1f meters, left: %.1f meters)%n",
                    Name,
                    distance,
                    RunLimit,
                    distance - RunLimit);
        }
    }

    public void swim(float distance){
        if (distance <= SwimLimimt){
            System.out.printf("%s swam %.1f meters%n", Name, distance);
        }
        else {
            System.out.printf(
                    "%s couldn't swam %.1f meters (swam: %.1f meters, left: %.1f meters)%n",
                    Name,
                    distance,
                    SwimLimimt,
                    distance - SwimLimimt);
        }
    }
}
