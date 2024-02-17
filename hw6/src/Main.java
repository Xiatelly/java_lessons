import figures.*;
import members.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main main =  new Main();

        main.testFigures();
        main.testMembers();
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
        System.out.println();
    }

    private void testMembers(){
        ArrayList<Obstacle> obstacles = new ArrayList<Obstacle>();
        obstacles.add(new Wall(2.0f));
        obstacles.add(new Wall(1.50f));
        obstacles.add(new RunningTrack(75.0f));
        obstacles.add(new RunningTrack(100.0f));

        ArrayList<Member> members = new ArrayList<Member>();
        members.add(new Human("Hero", 2.50f, 150.0f));
        members.add(new Cat("Cat", 1.0f, 125.0f));
        members.add(new Robot("T1000", 300.0f, 300.0f));

        for (Member member : members) {
            boolean overcameAllObstacles = true;

            for (Obstacle obstacle : obstacles) {
                boolean overcomeResult = member.overcome(obstacle);
                System.out.println();
                if (!overcomeResult) {
                    overcameAllObstacles = false;
                    break;
                }
            }

            if (overcameAllObstacles)
                System.out.printf("%s overcame all obstacles!!!%n%n", member.getName());
        }
    }
}