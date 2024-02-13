import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        HomeWorkApp app = new HomeWorkApp();

        final int TEST_DIGIT = 15;

        System.out.println("##Task2##");
        app.printThreeWords();

        System.out.println("##Task3##");
        app.checkSumSign();

        System.out.println("##Task4##");
        app.printColor();

        System.out.println("##Task5##");
        app.compareNumbers();

        System.out.println("##Task6##");
        boolean task6Result = app.checkDigitSum();
        System.out.println(task6Result);

        System.out.println("##Task7##");
        app.checkDigitSign(TEST_DIGIT);

        System.out.println("##Task8##");
        boolean task8Result = app.isDigitPositive(TEST_DIGIT);
        System.out.println(task8Result);

        System.out.println("##Task9##");
        app.printString("Current String", 3);

        System.out.println("##Task10##");
        boolean yearCheck = app.leapYearCheck(2032);
        System.out.println(yearCheck);
    }

    private void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private void checkSumSign() {
        int a = 15;
        int b = -34;
        int c = a + b;

        if (c >= 0) {
            System.out.println("The Sum is positive");
            return;
        }

        System.out.println("The Sum is negative");
    }

    private void printColor(){
        int digit = 25;

        if (digit <= 0) {
            System.out.print("Red\n");
            return;
        }

        if(digit >0 && digit <=100) {
            System.out.print("Yellow\n");
            return;
        }

        System.out.print("Green\n");
    }

    private void compareNumbers(){
        int a = 34;
        int b = 44;

        if (a >= b){
            System.out.print("a >= b\n");
            return;
        }

        System.out.print("a < b\n");
    }

    private boolean checkDigitSum(){
        System.out.print("Input a: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Input b: ");
        int b = scan.nextInt();
        return (a + b >= 10 && a + b <= 20);
    }

    private void checkDigitSign(int digit){
        if (digit >= 0){
            System.out.print("Its a positive number\n");
            return;
        }

        System.out.print("Its a negative number\n");
    }

    private boolean isDigitPositive(int digit){
        return (digit >= 0);
    }

    private void printString(String str, int count){
        for (int i = 0; i< count; i++)
            System.out.println(str);
    }

    private boolean leapYearCheck(int year){
        if (year%4 != 0)
            return false;
        return (year%100 != 0 || year%400 == 0);
    }
}