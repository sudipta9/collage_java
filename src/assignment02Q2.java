import java.util.Scanner;

class Shape {
    double length, breadth;

    Shape(double l, double b) {
        length = l;
        breadth = b;
    }

    Shape(double len) {
        length = breadth = len;
    }

    double calculate() {
        return length * breadth;
    }
}

public class assignment02Q2 extends Shape {
    double height;

    assignment02Q2(double l, double h) {
        super(l);
        this.length = l;
        this.height = h;
    }

    assignment02Q2(double l, double b, double h) {
        super(l, b);
        this.length = l;
        this.breadth = b;
        this.height = h;
    }

    double calculate() {
        return length * breadth * height;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length : ");
        double l = input.nextDouble();
        System.out.print("Enter the breadth : ");
        double b = input.nextDouble();
        System.out.print("Enter the height : ");
        double h = input.nextDouble();
        input.close();
        assignment02Q2 myShape1 = new assignment02Q2(l, h);
        assignment02Q2 myShape2 = new assignment02Q2(l, b, h);
        double volume1;
        double volume2;
        volume1 = myShape1.calculate();
        volume2 = myShape2.calculate();
        System.out.println(volume1);
        System.out.println(volume2);
    }
}