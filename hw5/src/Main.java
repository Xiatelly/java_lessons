public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("### Task 1 ###");
        main.testAnimals();
    }

    private void testAnimals(){
        final float runDistance = 400.0f;
        final float swimDistance = 5.0f;

        Cat cat0 = new Cat("Lucky");
        cat0.run(runDistance);
        cat0.swim(swimDistance);
        System.out.println();

        Dog dog0 = new Dog("Bob");
        dog0.run(runDistance);
        dog0.swim(swimDistance);
        System.out.println();

        Dog dog1 = new Dog("Snow");
        dog1.run(600);
        dog1.swim(20);
        System.out.println();

        Animal.printAnimalsCount();
    }
}