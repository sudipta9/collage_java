import java.util.*;

public class assignment02Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length of the Array : ");
        int length = input.nextInt();
        int[] name = new int[length];
        int sum = 0;
        System.out.print("Enter the values : ");
        try {
            for (int i = 0; i < length; i++) {
                int userInput = input.nextInt();
                name[i] = userInput;
                sum = sum + name[i];
            }
            input.close();
            System.out.println(sum);
        } catch (InputMismatchException e) {
            System.out.println("You entered bad data.");
        }
    }
}
