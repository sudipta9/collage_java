public class createMethod {
    public static void main(String[] args) {
        test obj = new test();
        obj.withoutParameter();
        int val = obj.increment(5);
        System.out.println(val);
    }
}

class test {

    // method without parameter and without return value
    void withoutParameter() {
        System.out.println("without parameter method called.");
    }

    // method with parameter, and return value
    int increment(int someInput) {
        someInput++;
        return someInput;
    }
}