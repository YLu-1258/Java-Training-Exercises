public class Polymorphism {
    public static void main(String[] args) {
        SlowCalculator Slow_calc = new SlowCalculator();
        System.out.println(Slow_calc.division(39.0,49.0));
        System.out.println(Slow_calc.division(39,49));
        System.out.println(Slow_calc.multiplication(39,49));

    }
}

class Calculator {
    public int division(int x, int y) {
        return x/y;
    }

    public double division(double x, double y) {
        return x/y;
    }

    public int multiplication(int x, int y) {
        return x*y;
    }
}
class SlowCalculator extends Calculator {
    @Override
    public int multiplication(int x, int y) {
        int total = 0;
        for (int i = 0; i < y; i++) {
            total+=x;
        }
        return total;
    }
}