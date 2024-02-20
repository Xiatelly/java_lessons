package figures;

import java.util.List;

public class FigureMathUtil {
    private FigureMathUtil() {}

    public static float CalculateSquareSum(List<Figure> figures){
        float sum = 0.0f;

        for (Figure figure : figures)
            sum += figure.square();

        return sum;
    }
}
