import java.util.*;

public class Assignment1Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A value:");
        int a = input.nextInt();
        System.out.println("Enter B value:");
        int b = input.nextInt();
        System.out.println("Enter C value:");
        int c = input.nextInt();
        input.close();

        // check if the triangle is valid or not
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            // calculating the semi-parameter
            double semiParameter = (a + b + c) / 2;
            // calculating the Area
            double result = Math.sqrt(semiParameter * (semiParameter - a) * (semiParameter - b) * (semiParameter - c));
            System.out.println("Area of the triangle is " + result);
        } else {
            System.out.println("Triangle is not valid");
        }
    }
}
