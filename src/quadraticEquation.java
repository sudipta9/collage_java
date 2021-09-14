import java.util.Scanner;

public class quadraticEquation {
    private double a;
    private double b;
    private double c;

    quadraticEquation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 'a' value: ");
        a = input.nextInt();
        System.out.print("Enter 'b' value: ");
        b = input.nextInt();
        System.out.print("Enter 'c' value: ");
        c = input.nextInt();
        input.close();
    }

    double getDiscriminant() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    private double getRoot1(double determinant) {
        return (-b + Math.sqrt(determinant)) / (2 * a);
    }

    private double getRoot2(double determinant) {
        return (-b - Math.sqrt(determinant)) / (2 * a);
    }

    void getAllRoots() {
        double determinant = this.getDiscriminant();
        if (determinant < 0)
            System.out.println("The equation has no roots");
        else if (determinant == 0)
            System.out.println("root of the given quadratic equation is: " + this.getRoot1(determinant));
        else {
            double r1 = this.getRoot1(determinant);
            double r2 = this.getRoot2(determinant);
            System.out.println("roots of the given quadratic equation are: " + r1 + " and " + r2);
        }
    }

    public static void main(String[] args) {
        quadraticEquation obj = new quadraticEquation();
        obj.getAllRoots();
    }
}
