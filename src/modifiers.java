public class modifiers {
    public static void main(String[] args) {
        demo abc = new demo();

        // System.out.println(abc.i); // will create an compile time error because the i
        // value is private
        abc.printValue();
        abc.printHello();
    }
}

class demo {
    private int i = 5;

    void printValue() {
        System.out.println(i);
    }

    protected void printHello() {
        System.out.println("hello");
    }
}