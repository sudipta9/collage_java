import java.util.Scanner;

public class assignment1Q2 {
    Scanner input = new Scanner(System.in);

    assignment1Q2() {
        System.out.println("Enter Your Age:");
        int age = input.nextInt();
        if (age > 18) {
            System.out.println("Enter Your Weight:");
            int weight = input.nextInt();
            if (weight >= 45)
                System.out.println("You can Donate Blood");
            else
                System.out.println("You cannot Donate Blood");
        } else
            System.out.println("You cannot Donate Blood");
    }

    public static void main(String[] args) {
        new assignment1Q2();
    }
}
