// Write a program to demonstrate constructor (with no-arg, parameterized, Default constructor).

public class simpleConstructor {
    // * default (no constructor)
    int i;

    // * no args
    private simpleConstructor() {
        System.out.println("no args constructor called");
    }

    // * parameterized
    // private simpleConstructor(int i) {
    // System.out.println("i value is: " + i);
    // }

    void fun() {
        System.out.println("fun called\ni value is: " + i);
    }

    public static void main(String[] args) {

        simpleConstructor abc = new simpleConstructor();
        abc.fun();
    }
}
