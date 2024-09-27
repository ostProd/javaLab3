public class func1 {
    public static void main(String[] args) {
        printResults(0, 0);
        printResults(0, 1);
        printResults(1, 0);
        printResults(2, 1);
        printResults(4, -2);
        printResults(2, 15);


    }

    public static double executionEq(double k, double z) {
        double sum = 0;
        if (k > 15) {
            throw new IllegalArgumentException("param k = " + k);

        }
        for (int i = 1; i < k; i++) {
             sum += (1/z*i) + Math.tan(k / i);
        }
        return sum;
    }

    static void printResults(double k, double z) {
        System.out.print("z=" + z + " k=" + k + " result: ");
        try {
            System.out.println(executionEq(k, z));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());


        }
    }
}