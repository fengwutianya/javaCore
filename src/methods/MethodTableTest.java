package methods;

import java.lang.reflect.Method;

/**
 * Created by xuan on 16-11-6.
 */
public class MethodTableTest {
    public static void main(String[] args) throws Exception {
        Method square = MethodTableTest.class.getMethod("square", double.class);
        Method sqrt = MethodTableTest.class.getMethod("sqrt", double.class);
        printTable(1, 10, 10, square);
        printTable(-8, 10, 10, sqrt);
    }

    public static double square(double x) {
        return x*x;
    }

    public static double sqrt(double x) {
        return x > 0 ? x : (-x);
    }

    public static void printTable(double from, double to, int n, Method f) {
        System.out.println(f);
        double dx = (to - from)/(n-1);

        for (double x = from; x <= to; x += dx) {
            try {
                double y = (double) f.invoke(null, x);
                System.out.printf("%10.4f | %10.4f%n", x, y);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
