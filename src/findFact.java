// find the factorial

public class findFact {
    public static void main(String[] args) {
        newClass obj = new newClass();
        System.out.println(obj.factorial(10));
    }
}

class newClass {
    int factorial(int i){
        if(i > 0)
            return (i * factorial(i-1));
        return 1;
    }
}