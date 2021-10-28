class multiThreadingByClass extends Thread {
    String name;

    multiThreadingByClass(String getName) {
        this.name = getName;
    }

    public void run() {
        try {
            System.out.println("Thread " + this.name + "is running with ID: " + Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Something going wrong... " + e);
        }
    }
}

// creating Thread using Runnable interface
class multiThreadingByRunnable implements Runnable {
    String name;

    multiThreadingByRunnable(String getName) {
        this.name = getName;
    }

    public void run() {
        try {
            System.out.println("Thread " + this.name + "is running with ID: " + Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Something going wrong... " + e);
        }
    }
}

public class demoMultiThreading {
    public static void main(String[] args) {
        multiThreadingByClass obj1 = new multiThreadingByClass("First Thread");

        Thread obj2 = new Thread(new multiThreadingByRunnable("Second Thread"));

        multiThreadingByClass obj3 = new multiThreadingByClass("Third Thread");

        // set the priority for the thread
        obj1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj1.getPriority());
        obj3.setPriority(Thread.MIN_PRIORITY);
        System.out.println(obj3.getPriority());

        obj1.start();
        obj2.start();
        obj3.start();
    }
}
