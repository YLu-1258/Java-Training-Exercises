public class VoidMethods {
    public static void main(String[] args) {
        for (String s: args) {
            if (Double.parseDouble(s) > 10) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
