package thread;

public class Multithreading implements Runnable {
    private int i;

    public void run() {
        for (i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                Multithreading rtt = new Multithreading();
                new Thread(rtt, "新线程1").start();
                new Thread(rtt, "新线程2").start();
            }
        }
    }
}
