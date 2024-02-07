import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        HomeWorkApp app = new HomeWorkApp();

        final int testDigit = 15;

        System.out.println("##Task2##");
        app.printThreeWords();

        System.out.println("##Task3##");
        app.checkSumSign();

        System.out.println("##Task4##");
        app.printColor();

        System.out.println("##Task5##");
        app.compareNumbers();

        System.out.println("##Task6##");
        app.checkDigitSum();

        System.out.println("##Task7##");
        app.checkDigitSign(testDigit);

        System.out.println("##Task8##");
        boolean task8Result = app.isDigitPositive(testDigit);
        System.out.printf("%b%n", task8Result);

        System.out.println("##Task9##");
        app.printString("Current String", 3);

        System.out.println("##Task10##");
        boolean yearCheck = app.leapYearCheck(2032);
        System.out.printf("%b%n", yearCheck);
    }

    private void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private void checkSumSign() {
        final int a = 15;
        final int b = -34;

        final int c = a + b;
        if (c >= 0) {
            System.out.println("The Sum is positive");
        } else {
            System.out.println("The Sum is negative");
        }
    }

    private void printColor(){
        final int digit = 25;

        if (digit <= 0) {
            System.out.print("Red\n");
        } else if(digit >0 && digit <=100) {
            System.out.print("Yellow\n");
        } else if (digit >100) {
            System.out.print("Green\n");
        }
    }

    private void compareNumbers(){
        final int a = 34;
        final int b = 44;

        if (a >= b){
            System.out.print("a >= b\n");
        }
        else {
            System.out.print("a < b\n");
        }
    }

    private void checkDigitSum(){
        boolean sumAB = true;
        System.out.print("Input a: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Input b: ");
        int b = scan.nextInt();

        if (a + b >= 10 && a + b <= 20 ){
            System.out.printf("%b%n", sumAB);
        }
        else {
            sumAB = false;
            System.out.printf("%b%n", sumAB);
        }
    }

    private void checkDigitSign(int digit){
        if (digit >= 0){
            System.out.print("Its a positive number\n");
        }
        else{
            System.out.print("Its a negative number\n");
        }
    }

    private boolean isDigitPositive(int digit){
        return (digit >= 0);
    }

    private void printString(String str, int count){

        for (int i = 0; i< count; i++){
            System.out.println(str);
        }
    }

    private boolean leapYearCheck(int year){
        final boolean yearDevidingBy4 = (year%4 == 0);
        final boolean yearDevidingBy100 = (year%100 == 0);
        final boolean yearDevidingBy400 = (year%400 == 0);

        if (yearDevidingBy4 && (!yearDevidingBy100 || yearDevidingBy400)){
            return true;
        }
        return false;
    }
}