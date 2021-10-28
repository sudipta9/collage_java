// 1. Write a program to implement multiple catch block

public class demoMultiCatch {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.err.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println("rest of the code");
    }
}
