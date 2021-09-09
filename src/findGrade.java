import java.util.*;

public class findGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter average Score");
        double score = input.nextDouble();
        input.close();

        if (score > 80) {
            System.out.print("Your grade is A");
        } else if (score > 60 && score <= 80) {
            System.out.print("Your grade is B");
        } else if (score > 40 && score <= 60) {
            System.out.print("Your grade is C");
        } else {
            System.out.print("Your grade is D");
        }
    }
}
