public class func3 {
    public static void main(String[] args) {
        result(1e-1);
        result( 1e-5);
        result( 3e-4);
        result( 2e-1);
        result( 7e-7);

    }
    public static double sum(double e) {
        if (e<0){
            throw new IllegalArgumentException("Problem, your e =" + e);
        }
        double result = 0;
        double sum = 0;
        int i=1;
        while (true) {
            result = Math.pow(-1.0, i+1)/(i * (i + 1) * (i + 2));
            sum+=result;
            if(Math.abs(result)< e){
                return result;
            }
            i++;
        }
    }
    static void result(double e) {
        System.out.print("e " + e + "result: ");
        try {
            System.out.println(sum(e));
        } catch (IllegalArgumentException er) {
            System.out.println("EXCEPTION! " + er.getMessage());
        }
    }
}
