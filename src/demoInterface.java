public class demoInterface {
    public static void main(String[] args) {
        cat foo = new cat();
        foo.animalSound();
        foo.run();
        foo.sleep();
    }
}

/**
 * animal
 */
interface Animal {
    public void animalSound();

    public void run();
}

class cat implements Animal {
    public void animalSound() {
        System.out.println("meow");
    }

    public void run() {
        System.out.println("Cat is running");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}