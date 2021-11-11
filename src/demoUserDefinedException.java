public class demoUserDefinedException {
    static void newThrows() throws ArithmeticException {
        System.out.println("Some Arithmetic Exception occurred!");
    }

    static void anotherException() {
        try {
            throw new Exception("Something went wrong!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        try {
            newThrows();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("some code here!");
        try {
            anotherException();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
