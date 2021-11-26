public class assignment02Q7 {
    public static void main(String[] args) {
        Thread obj = new Thread(new ThreadRun());
        obj.start();
    }
}

class ThreadRun implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable interface");
    }
}