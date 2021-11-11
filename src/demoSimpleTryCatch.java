public class demoSimpleTryCatch {
    public static void main(String[] args) {
        System.out.println();
        try {
            int data = 50 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}