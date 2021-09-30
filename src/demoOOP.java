public class demoOOP {
    public static void main(String[] args) {
        A classAObj = new A();
        classAObj.greet();
        B classBObj = new B();
        classBObj.greet();
        classBObj.add(5, 7);
        C classCObj = new C();
        classCObj.greet();
        classCObj.add(10, 5);
        classCObj.findRoot(25);
        D classDObj = new D();
        classDObj.greet();
        classDObj.add(10, 5);
        classDObj.findRoot(25);
        classDObj.findSquare(4);
    }
}

class A {
    void greet() {
        System.out.println("Hello from class A");
    }
}

class B extends A {
    void add(int m, int n) {
        System.out.println(m + n);
    }
}

class C extends B {
    void findRoot(int num) {
        System.out.println(Math.sqrt(num));
    }
}

class D extends C {
    void findSquare(int n) {
        System.out.println(Math.pow(n, 2));
    }
}