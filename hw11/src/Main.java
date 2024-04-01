

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        String[][] stringArray = new String[4][4];
        stringArray[0][0] = "0";
        stringArray[0][1] = "2";
        stringArray[0][2] = "3";
        stringArray[0][3] = "12";
        stringArray[1][0] = "6";
        stringArray[1][1] = "23";
        stringArray[1][2] = "78";
        stringArray[1][3] = "11";
        stringArray[2][0] = "4";
        stringArray[2][1] = "5";
        stringArray[2][2] = "45";
        stringArray[2][3] = "8";
        stringArray[3][0] = "9";
        stringArray[3][1] = "56";
        stringArray[3][2] = "25";
        stringArray[3][3] = "62";

        String[][] stringArray2 = new String[4][];
        stringArray2[0] = new String[4];
        stringArray2[1] = new String[4];
        stringArray2[2] = new String[3];
        stringArray2[3] = new String[1];

        String[][] stringArray3 = new String[4][4];
        stringArray3[0][0] = "0";
        stringArray3[0][1] = "2";
        stringArray3[0][2] = "3";
        stringArray3[0][3] = "7";
        stringArray3[1][0] = "6";
        stringArray3[1][1] = "23";
        stringArray3[1][2] = "78";
        stringArray3[1][3] = "J";
        stringArray3[2][0] = "4";
        stringArray3[2][1] = "5";
        stringArray3[2][2] = "43";
        stringArray3[2][3] = "8";
        stringArray3[3][0] = "9";
        stringArray3[3][1] = "56";
        stringArray3[3][2] = "25";
        stringArray3[3][3] = "62";

        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();

        for (String[][] arr : new String[][][]{stringArray, stringArray2, stringArray3}) {
            try {
                int sumArray = arrayValueCalculator.doCalc(arr);
                System.out.println(sumArray);
            } catch (ArraySizeException | ArrayDataException e) {
                System.out.print("Exception: ");
                System.out.println(e.getMessage());
            }
        }
    }
}