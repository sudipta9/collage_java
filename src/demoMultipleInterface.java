public class demoMultipleInterface {
    public static void main(String[] args) {
        AnotherCat obj = new AnotherCat();
        obj.animalSound();
        obj.run();
        obj.sleeping();
    }
}

interface AnotherAnimal {
    public void animalSound();

    public void run();
}

interface SlippingAnimal {
    public void sleeping();
}

class AnotherCat implements AnotherAnimal, SlippingAnimal {
    public void animalSound() {
        System.out.println("meow");
    }

    public void run() {
        System.out.println("Cat is Running");
    }

    public void sleeping() {
        System.out.println("Cat is sleeping");
    }
}