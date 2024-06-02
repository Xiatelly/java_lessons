
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.testPetrolStation();
    }

    private Runnable createPetrolStationConsumer(
            String name,
            PetrolStation petrolStation,
            float requiredAmount){
        return () -> {
            System.out.printf("%s refuel started...%n", name);
            float refueledAmount = petrolStation.doRefuel(requiredAmount);
            System.out.printf("%s refuel result: %.1f/%.1f%n", name, refueledAmount, requiredAmount);
        };
    }

    private void testPetrolStation(){
        PetrolStation petrolStation = new PetrolStation(200.0f);

        Thread[] threads = new Thread[5];

        threads[0] = new Thread(
                createPetrolStationConsumer("Thread0", petrolStation, 60.0f));
        threads[1] = new Thread(
                createPetrolStationConsumer("Thread1", petrolStation, 25.0f));
        threads[2] = new Thread(
                createPetrolStationConsumer("Thread2", petrolStation, 100.0f));
        threads[3] = new Thread(
                createPetrolStationConsumer("Thread3", petrolStation, 10.0f));
        threads[4] = new Thread(
                createPetrolStationConsumer("Thread4", petrolStation, 37.0f));

        for (Thread thread : threads)
            thread.start();

        try {
            for (Thread thread : threads)
                thread.join();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}