import java.util.Scanner;
//import java.io.print
//

public class HomeWorkApp {
    public static void main(String[] args) {
        int b = -5;
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        checkNumbers6();
        numbersCheck7(b);
        numbersCheck8(b);
        printString9("Current String", 5);
        boolean yearCheck = leapYearCheck(2022);
        System.out.printf("%b%n", yearCheck);
    }

    public static void printThreeWords() {
        System.out.print("Orange\n");
        System.out.print("Banana\n");
        System.out.print("Apple\n");
    }

    public static void checkSumSign() {
        int a = 15;
        int b = -34;

        int c = a + b;
        if (c >= 0) {
            System.out.print("The Sum is positive\n");
        } else {
            System.out.print("The Sum is negative\n");
        }
    }

    public static void printColor(){
        int value = 25;

        if (value <= 0) {
            System.out.print("Red\n");
        } else if(value >0 && value <=100) {
            System.out.print("Yellow\n");
        } else if (value >100) {
            System.out.print("Green\n");
        }
    }

    public static void compareNumbers(){
        int a = 34;
        int b = 44;

        if (a >= b){
            System.out.print("a >= b\n");
        }
        else {
            System.out.print("a < b\n");
        }
    }

    public static void checkNumbers6(){
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

    public static void numbersCheck7(int a){
        if (a >= 0){
            System.out.print("Its a positive number\n");
        }
        else{
            System.out.print("Its a negative number\n");
        }
    }

    public static void numbersCheck8(int a){
        if (a >= 0){
            System.out.print("True\n");
        }
        else{
            System.out.print("False\n");
        }
    }

    public static <string> void printString9(string st, int a){

        for (int i = 0; i< a; i++){
            System.out.printf("%s%n", st);
        }
    }

    public static boolean leapYearCheck(int year){
        boolean isDevidedBy4 = (year%4 == 0);
        boolean isDevidedBy100 = (year%100 == 0);
        boolean isDevidedBy400 = (year%400 == 0);

        if (isDevidedBy4 && (!isDevidedBy100 || isDevidedBy400)){
           return true;
        }
        return false;
    }
}