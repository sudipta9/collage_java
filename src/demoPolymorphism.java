public class demoPolymorphism {
    public static void main(String[] args) {
        demoCLassPoly obj1 = new demoCLassPoly();
        obj1.add(10, 15);
        obj1.add(5, 10, 15);
        obj1.findAnswer(4);
        newClass obj2 = new newClass();
        obj2.findAnswer(4);
    }
}

class demoCLassPoly {
    void add(int m, int n) {
        System.out.println(m + n);
    }

    void add(int m, int n, int o) {
        System.out.println(m + n + o);
    }

    void findAnswer(int n) {
        System.out.println(Math.pow(n, 2));
    }
}

class newClass extends demoCLassPoly {
    void findAnswer(int n) {
        System.out.println(Math.sqrt(n));
    }
}