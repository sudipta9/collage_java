import java.util.Scanner;

public class areaOfTriangle {
    double a, b, c;

    areaOfTriangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter sides of the Triangle");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        input.close();
    }

    boolean isTriangleValid() {
        if (a < b + c && b < a + c && c < a + b) {
            return true;
        } else
            return false;
    }

    void calcArea() {
        if (this.isTriangleValid()) {
            double semiPerimeter = (a + b + c) / 2;
            double area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
            System.out.println("Area of the Triangle is: " + area);
        } else {
            System.out.println("Triangle is not valid");
        }
    }

    public static void main(String[] args) {
        areaOfTriangle obj = new areaOfTriangle();
        obj.calcArea();
    }
}