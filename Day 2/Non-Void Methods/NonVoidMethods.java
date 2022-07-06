public class NonVoidMethods {
    static String myMethod(String s) {
        return s + " is friends with Albert";
    }

    static double doubler(double x) {
        return x*2;
    }

    static boolean invert(boolean y) {
        return !y;
    }
    public static void main(String[] args) {
        System.out.println(myMethod("Alex"));
        System.out.println(doubler(3749));
        System.out.println(invert(false));
    }
}
