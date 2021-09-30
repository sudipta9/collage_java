// * 1. Write a program to differ the keyword break and continue. 

public class breakWithJava {
    public static void main(String[] args) {
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                System.out.println("Continue");
                continue;
            }

            if (i == 9) {
                System.out.println("Break");
                break;
            }

            System.out.println(i);
        }
    }
}
