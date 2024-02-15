package figures;
import figures.IFigure;

import java.util.ArrayList;

public final class FigureMath {
    private FigureMath() {}

    public static float CalculateSquareSum(ArrayList<IFigure> figures){
        float sum = 0.0f;

        for (IFigure figure : figures)
            sum += figure.square();

        return sum;
    }
}
