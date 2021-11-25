public class assignment03Q7 {
    public static void main(String[] args) {
        ThreadRun obj = new ThreadRun();
        obj.start();
    }
}

class ThreadRun extends Thread {
    public void run() {
        System.out.println("Thread using Runnable interface");
    }
}