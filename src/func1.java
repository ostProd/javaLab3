public class func1 {
    public static void main(String[] args) {
        result(0, 0);
        result(0, 1);
        result(1, 0);
        result(2, 1);
        result(1, 2);
        result(2, 15);


    }

    public static double sum(double k, double z) {
        double sum = 0;
        if (k > 15 || z <= 0) {
            throw new IllegalArgumentException("param k = " + k);

        }
        for (int i = 1; i < k; i++) {
             sum += (1 / z * i) + Math.tan(k / i);
            }
        return sum;
    }

    static void result(double k, double z) {
        System.out.print("z=" + z + "k=" + k + "result: ");
        try {
            System.out.println(sum(k, z));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());


        }
    }
}