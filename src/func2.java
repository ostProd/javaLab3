//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.Math;

public class func2 {
    public static void main(String[] args) {
        printResults(0, 0);
        printResults(0, 1);
        printResults(1, 0);
        printResults(1, 1);
        printResults(2, 1);
        printResults(1, 2);
        printResults(2, -9);
        printResults(20, -10);
        printResults(21, 7);
        printResults(1, 10);
        printResults(-1, 10);
        printResults(0, Double.MAX_VALUE);
        printResults(1, Double.MAX_VALUE);
        printResults(1, Double.NaN);


    }

    public static double axx(double t, double l) {
        if (l % 2 == 0 ) {
            return (1 /t) * l;
        }else if(l % 2 == 1){
            return l / Math.sqrt(t);
        }
        throw new IllegalArgumentException("param l = " + l);
    }

    static void printResults(double t, double l) {
        System.out.print("t:" + t + " l:" + l + " result:");
        try {
            if(t <= 0) {
                throw new IllegalArgumentException("param t = " + t);
            }else if(l < 0){
                throw new IllegalArgumentException("param l = " + l);
            }
            double result = 0;
            for (int i = 0; i < t ; i++) {
                result += axx(t, l);
            }
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}