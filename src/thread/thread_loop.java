package thread;

class thread1 implements Runnable {
    @Override
    public String toString() {
        return super.toString();
    }

    Thread t;

    public thread1() {
        t = new Thread(this, "demo thread");
        System.out.println("child thread info:" + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 6; i > 0; i--) {
                System.out.println("child thread:" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("child thread interrupted");
        }
        System.out.println("child thread exiting");
    }
}

public class thread_loop {
    public static void main(String[] args) {
        new thread_loop();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("main thread:" + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }
        System.out.println("main thread exiting");
        thread1 t = new thread1();
        System.out.println(t.toString());
    }
}
