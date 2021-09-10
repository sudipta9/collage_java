// Write a program to find the square root and power using math function

import java.util.*;

public class findSqrtAndSquare {

    Scanner input = new Scanner(System.in);

    void findSqrt() {
        System.out.println("Enter Number to find square root");
        int i = input.nextInt();
        System.out.println(Math.sqrt(i));
    }

    void findSquare() {
        System.out.println("Enter the base value:");
        int i = input.nextInt();
        System.out.println("Enter the power value:");
        int j = input.nextInt();
        System.out.println(Math.pow(i, j));
    }

    public static void main(String[] args) {
        System.out.println("");
        findSqrtAndSquare result = new findSqrtAndSquare();
        result.findSqrt();
        result.findSquare();
    }
}
