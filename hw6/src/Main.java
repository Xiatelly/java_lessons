import figures.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Main main =  new Main();
        System.out.println("### Task 0 ###");
        main.testFigures();

    }
    private void testFigures(){
        Circle circle0 = new Circle(2.0f);        ;
        System.out.println(circle0.square());
        Triangle triangle0 = new Triangle(3.0f, 5.0f, 4.0f);
        System.out.println(triangle0.square());
        Square square0 = new Square(3.0f);
        System.out.println(square0.square());

        ArrayList<IFigure> figures = new ArrayList<IFigure>();
        figures.add(circle0);
        figures.add(triangle0);
        figures.add(square0);

        float squareSum = FigureMath.CalculateSquareSum(figures);
        System.out.println(squareSum);

    }
}