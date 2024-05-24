import java.util.Arrays;

public class ValueCalculator {
    private final int NUM_ARRAY_SIZE = 1_000_000;
    private final int NUM_ARRAY_HALF_SIZE = NUM_ARRAY_SIZE / 2;
    private final float[] numArray = new float[NUM_ARRAY_SIZE];
    private static void processHalfArray(float[] arr){
        for (int i = 0; i < arr.length; i++){
            arr[i] = (float)(arr[i] *
                    Math.sin(0.2f + i / 5.0f) *
                    Math.cos(0.2f + i / 5.0f) *
                    Math.cos(0.4f + i / 2.0f));
        }
    }

    public void calculate() throws InterruptedException {
        long startTimeStamp = System.currentTimeMillis();

        Arrays.fill(numArray, 1.0f);

        Thread thread0 = new Thread(() -> {
            float[] halfNumArray0 = new float[NUM_ARRAY_HALF_SIZE];
            System.arraycopy(numArray, 0, halfNumArray0, 0, NUM_ARRAY_HALF_SIZE);
            processHalfArray(halfNumArray0);
            System.arraycopy(halfNumArray0, 0, numArray, 0, NUM_ARRAY_HALF_SIZE);
        });

        Thread thread1 = new Thread(() -> {
            float[] halfNumArray1 = new float[NUM_ARRAY_HALF_SIZE];
            System.arraycopy(numArray, NUM_ARRAY_HALF_SIZE, halfNumArray1, 0, NUM_ARRAY_HALF_SIZE);
            processHalfArray(halfNumArray1);
            System.arraycopy(halfNumArray1, 0, numArray, NUM_ARRAY_HALF_SIZE, NUM_ARRAY_HALF_SIZE);
        });

        thread0.start();
        thread1.start();
        thread0.join();
        thread1.join();

        long elapsedTime = System.currentTimeMillis() - startTimeStamp;
        System.out.printf("Elapsed time: %d ms",elapsedTime);
    }
}
