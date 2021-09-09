import java.util.*;

public class sumOfn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many number you want to add?");
        int num = input.nextInt();
        int total = 0;
        while (num > 0) {
            total = total + input.nextInt();
            num--;
        }
        input.close();

        System.out.println("result is: " + total);
    }
}
