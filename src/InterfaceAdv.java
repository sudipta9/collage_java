public class InterfaceAdv {
    public static void main(String[] args) {
        bike obj1 = new bike();
        obj1.changeGear(3);
        obj1.speedUp(20);
        obj1.ApplyBreak(5);
        obj1.getState();

        bicycle obj2 = new bicycle();
        obj2.changeGear(2);
        obj2.speedUp(10);
        obj2.ApplyBreak(3);
        obj2.getState();
    }
}

interface Vehicle {
    public void changeGear(int gearValue);

    public void ApplyBreak(int breakValue);

    public void speedUp(int speedValue);

    public void getState();
}

class bike implements Vehicle {
    int speed;
    int gear;

    public void changeGear(int gearValue) {
        gear = gearValue;
    }

    public void speedUp(int speedValue) {
        speed += speedValue;
    }

    public void ApplyBreak(int breakValue) {
        speed -= breakValue;
    }

    public void getState() {
        System.out.println("Bike's Speed: " + speed + " Gear: " + gear);
    }

}

class bicycle implements Vehicle {
    int speed;
    int gear;

    public void changeGear(int gearValue) {
        gear = gearValue;
    }

    public void speedUp(int speedValue) {
        speed += speedValue;
    }

    public void ApplyBreak(int breakValue) {
        speed -= breakValue;
    }

    public void getState() {
        System.out.println("Bicycle's Speed: " + speed + " Gear: " + gear);
    }
}