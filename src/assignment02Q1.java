public class assignment02Q1 {
    static void swapNumber(IntWrapper a, IntWrapper b){
        System.out.println("Before swapping, a = " + a.num + " b = " + b.num);
        IntWrapper temp = new IntWrapper(a.num);
        a.num = b.num;
        b.num = temp.num;
        System.out.println("After swapping, a = " + a.num + " b = " + b.num);
    }
    public static void main(String[] args) {
        IntWrapper a = new IntWrapper(30);
        IntWrapper b = new IntWrapper(50);
        swapNumber(a, b);
    }
}

class IntWrapper{
   public int num;
   public IntWrapper(int a){ this.num = a;}
}