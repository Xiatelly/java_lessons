package mymath;

public final class MyMath {
    private MyMath() {}
    public static double sqrt(double a) { return StrictMath.sqrt(a); }

    public static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    public static int min(int a, int b) {
        return (a <= b) ? a : b;
    }
}

