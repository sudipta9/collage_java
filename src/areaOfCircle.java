// finding area of a circle

import java.util.*;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Radius");
        input.close();
        int radius = input.nextInt();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println(area);
    }
}
