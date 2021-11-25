public class assignment02Q3 {
    public static void main(String[] args) {
        mathOperation obj = new mathOperation();
        obj.sum(20, 10);
        obj.sum(20, 10.02);
        obj.sum(20.05, 10);
        obj.sum(20.05, 10.5);
        obj.multiply(20, 10);
        obj.multiply(20, 10.02);
        obj.multiply(20.05, 10);
        obj.multiply(20.05, 10.5);
    }
}

class mathOperation {
    public void sum(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is : " + (a + b));
    }

    public void sum(int a, double b) {
        System.out.println("Sum of " + a + " and " + b + " is : " + (a + b));
    }

    public void sum(double a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is : " + (a + b));
    }

    public void sum(double a, double b) {
        System.out.println("Sum of " + a + " and " + b + " is : " + (a + b));
    }

    public void multiply(int a, int b) {
        System.out.println("Multiply of " + a + " and " + b + " is : " + (a * b));
    }

    public void multiply(int a, double b) {
        System.out.println("Multiply of " + a + " and " + b + " is : " + (a * b));
    }

    public void multiply(double a, int b) {
        System.out.println("Multiply of " + a + " and " + b + " is : " + (a * b));
    }

    public void multiply(double a, double b) {
        System.out.println("Multiply of " + a + " and " + b + " is : " + (a * b));
    }
}