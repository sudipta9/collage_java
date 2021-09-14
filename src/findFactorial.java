// Write a program to find the factorial n numbers

public class findFactorial {
    int factorial(int i) {
        if (i > 0)
            return (i * factorial(i - 1));
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("");
        findFactorial obj = new findFactorial();
        System.out.println(obj.factorial(5));
    }
}
