import java.util.concurrent.Callable;

public class ConcurrentValueCalculatorTask implements Callable<Void> {
    private float[] numArray;
    private int position;
    private int length;

    public ConcurrentValueCalculatorTask(float[] numArray, int position, int length){
        this.numArray = numArray;
        this.position = position;
        this.length = length;
    }

    @Override
    public Void call() throws Exception {
        float[] tempNumArray = new float[length];
        System.arraycopy(numArray, position, tempNumArray, 0, length);
        for (int i = 0; i < tempNumArray.length; i++){
            tempNumArray[i] = (float)(tempNumArray[i] *
                    Math.sin(0.2f + i / 5.0f) *
                    Math.cos(0.2f + i / 5.0f) *
                    Math.cos(0.4f + i / 2.0f));
        }
        System.arraycopy(tempNumArray, 0, numArray, position, length);
        return null;
    }

}
