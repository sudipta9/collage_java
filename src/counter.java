// Write a program for counter with static variable and without static variable

public class counter {
    int count = 0;
    static int staticCount = 0;

    counter() {
        count++;
        staticCount++;
        System.out.println("non-static count value: " + count);
        System.out.println("Static count value: " + staticCount);
    }

    public static void main(String[] args) {
        System.out.println("");
        new counter();
        new counter();
        new counter();
    }
}