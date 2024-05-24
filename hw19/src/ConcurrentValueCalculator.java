import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ConcurrentValueCalculator {
    private final int NUM_ARRAY_SIZE = 1_000_000;
    private final int NUM_ARRAY_HALF_SIZE = NUM_ARRAY_SIZE / 2;
    private final float[] numArray = new float[NUM_ARRAY_SIZE];

    public void calculate() throws ExecutionException, InterruptedException {
        long startTimeStamp = System.currentTimeMillis();
        Arrays.fill(numArray, 1.0f);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<Callable<Void>> tasks = new ArrayList<>();
        tasks.add(new ConcurrentValueCalculatorTask(numArray, 0,NUM_ARRAY_HALF_SIZE));
        tasks.add(new ConcurrentValueCalculatorTask(numArray, NUM_ARRAY_HALF_SIZE, NUM_ARRAY_HALF_SIZE));

        try {
            List<Future<Void>> results = executorService.invokeAll(tasks);
            for (Future<Void> result : results)
                result.get();
        }
        finally {
            executorService.shutdown();
        }

        long elapsedTime = System.currentTimeMillis() - startTimeStamp;
        System.out.printf("Elapsed time: %d ms",elapsedTime);
    }
}
