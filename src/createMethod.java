public class createMethod {
    // method without parameter and without return value
    void withoutParameter() {
        System.out.println("without parameter method called.");
    }

    // method with parameter, and return value
    int increment(int someInput) {
        someInput++;
        return someInput;
    }

    public static void main(String[] args) {
        System.out.println("");
        createMethod obj = new createMethod();
        obj.withoutParameter();
        int val = obj.increment(5);
        System.out.println(val);
    }
}
