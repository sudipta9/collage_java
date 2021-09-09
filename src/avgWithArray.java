import java.util.*;

public class avgWithArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        int n[] = new int[5];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Enter " + (i + 1) + " Mark");
            n[i] = input.nextInt();
        }
        input.close();

        for (int i : n) {
            total += i;
        }
        ;

        System.out.println("Avg: " + total / n.length);
    }
}
