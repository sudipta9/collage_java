import java.util.*;

public class average {
    public static void main(String[] args){
        //creating the input object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = input.nextInt();
        
        System.out.println("Enter second number");
        int b = input.nextInt();

        System.out.println("Enter third number");
        int c = input.nextInt();

        double avg = (a+b+c)/3;
        System.out.println("Average is " + avg);
    }
}
