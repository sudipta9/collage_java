public class assignment02Q5 {
    static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Exception caught: Division by zero.");
        } else {
            double result = a / (b * 1.0);
            System.out.println(a + " divided by " + b + " = " + result);
        }
    }

    public static void main(String[] args) {
        try {
            divide(5, 2);
            divide(8, 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
