// 3. Write a program to calculate AVERAGE using an array.

import java.util.*;

public class avgWithArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;

        double n[] = new double[5];
        for (int i = 0; i < n.length; i++) {
            System.out.println("Enter " + (i + 1) + " Mark");
            n[i] = input.nextDouble();
        }
        input.close();

        for (double i : n) {
            total += i;
        }
        System.out.println("Avg: " + total / n.length);
    }
}
