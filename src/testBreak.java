import java.util.*;

public class testBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any Value:");
        int someInput = input.nextInt();
        input.close();

        while (someInput > 0) {
            System.out.println(someInput);
            if (someInput == 5) {
                System.out.println();
                continue;
            }
            --someInput;
        }
    }
}
