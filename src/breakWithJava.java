// * 1. Write a program to differ the keyword break and continue. 

public class breakWithJava {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i < 8)
                continue;
            if (i == 8)
                break;
        }
    }
}
