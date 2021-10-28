class Table {
    void printTable(int n) {
        for (int i = 1; i < 6; i++) {
            System.out.println(i * n);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println("Something Went Wrong");
            }
        }
    }
}

class myThread1 extends Thread {
    Table t;

    myThread1(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class myThread2 extends Thread {
    Table t;

    myThread2(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class TestSynchronization1 {
    public static void main(String[] args) {
        Table t = new Table();
        myThread1 obj1 = new myThread1(t);
        myThread2 obj2 = new myThread2(t);
        obj1.start();
        obj2.start();
    }
}