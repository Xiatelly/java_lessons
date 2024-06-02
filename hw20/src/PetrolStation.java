import java.util.Random;
import java.util.concurrent.Semaphore;

public class PetrolStation {
    private float gasAmount;
    private static final Semaphore semaphore = new Semaphore(3);

    public float getGasAmount() {
        return gasAmount;
    }

    public PetrolStation(float gas){
        this.gasAmount = gas;
    }

    public float doRefuel(float requiredAmount){
        try {
            semaphore.acquire();

            Random random = new Random();
            int sleepDuration = 3000 + random.nextInt(7000);
            Thread.sleep(sleepDuration);

            synchronized (this) {
                float availableAmount = Math.min(gasAmount, requiredAmount);
                gasAmount -= availableAmount;
                return availableAmount;
            }
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Thread was interrupted", e);
        }
        finally {
            semaphore.release();
        }
    }
}
