import java.util.Scanner;
// Write a program to print the prime numbers

public class primeNumber {
    public static void main(String[] args) {
        int n;
        // to count how many time n is devisable
        int counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check");
        n = input.nextInt();
        input.close();
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                counter += 1;
        }
        if (counter == 0)
            System.out.println("Prime number");
        else
            System.out.println("non-prime number");
    }
}