import java.util.Scanner;

public class findFact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to find factorial");
        int num = input.nextInt();
        input.close();
        if (num == 0) {
            System.out.println("0! = 1");
        } else if (num < 0) {
            System.out.println("Please enter a positive value to find Factorial");
        } else {
            int result = 1;
            for (int i = num; i > 1; i--) {
                result = result * i;
            }
            System.out.println(num + "! = " + result);
        }
    }
}
