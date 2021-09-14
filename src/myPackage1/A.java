// ! /myPackage1/A.java
package myPackage1;

public class A {
    /*
     * protected access modifier means that can only be access within the package
     * and outside the package but through inheritance only
     */
    protected void display() {
        System.out.println("Hello");
    }

    /*
     * Public method means this method can called within the package and outside the
     * package without any restriction
     */
    public void anotherDisplay() {
        System.out.println("Hello again");
    }

    public static void main(String[] args) {
        System.out.println("");
        demo obj = new demo();

        /*
         * trying to access i value from another class it will throw an error -
         * Exception in thread "main" java.lang.Error: Unresolved compilation problem:
         * The field demo.i is not visible
         */
        // System.out.println("i value is: " + obj.i);

        obj.display();
    }
}

/*
 * default class means this class can only be access inside this package named
 * 'myPackage1'. we can not access this class from 'myPackage2'
 */

class demo {
    // can be accessed only from demo class
    private int i = 10;

    void display() {
        System.out.println("i value is: " + i);
    }
}