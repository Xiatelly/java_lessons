public abstract class Animal {
    private static int sAnimalsCounter = 0;

    protected String name;
    protected float runLimit = 0.0f;
    protected float swimLimimt = 0.0f;

    public static void printAnimalsCount(){
        System.out.print("Animals count: ");
        System.out.println(sAnimalsCounter);
    }

    protected Animal(String name){
        this.name = name;
        sAnimalsCounter++;
    }

    public void run(float distance){
        if (distance <= runLimit){
            System.out.printf("%s ran %.1f meters%n", name, distance);
        }
        else {
            System.out.printf(
                    "%s couldn't ran %.1f meters (ran: %.1f meters, left: %.1f meters)%n",
                    name,
                    distance,
                    runLimit,
                    distance - runLimit);
        }
    }

    public void swim(float distance){
        if (distance <= swimLimimt){
            System.out.printf("%s swam %.1f meters%n", name, distance);
        }
        else {
            System.out.printf(
                    "%s couldn't swam %.1f meters (swam: %.1f meters, left: %.1f meters)%n",
                    name,
                    distance,
                    swimLimimt,
                    distance - swimLimimt);
        }
    }
}
