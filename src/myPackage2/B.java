// ! /myPackage2/B.java
package myPackage2;
/* 
* this will throw an error, 
* because demo is a class with default access modifier that means 
* it can only be access within myPackage1
*/

// import myPackage1.demo;

import myPackage1.A;

public class B {
    public static void main(String[] args) {
        System.out.println("");
        A obj1 = new A();

        /*
         * it will throw an error because B is not inheritance of A, and display is a
         * protected method. thus display cannot be accessible
         */
        // obj1.display()

        inheritOfA obj2 = new inheritOfA();
        obj2.callDisplay();

        // accessing public method from A
        obj1.anotherDisplay();
    }
}

class inheritOfA extends A {
    void callDisplay() {
        inheritOfA obj = new inheritOfA();

        /*
         * here we can access the display method because inheritOfA is a inheritance of
         * A class
         */
        obj.display();
    }
}