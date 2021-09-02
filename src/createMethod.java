public class createMethod {
    public static void main(String[] args) {
        test obj = new test();
        obj.testMethod(80);
    }
}

class test{
    void testMethod(int someInput){
        System.out.println(someInput);
    }
}