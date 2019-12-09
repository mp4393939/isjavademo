package thread;

class newthread4 implements Runnable {
    String name;
    Thread t;

    newthread4(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("new thread:" + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " exiting");
    }
}

public class isAlive_join {
    public static void main(String[] args) {
        newthread4 t1 = new newthread4("one");
        newthread4 t2 = new newthread4("two");
        newthread4 t3 = new newthread4("three");
        System.out.println("thread " + t1.t.getName() + " is alive:" + t1.t.isAlive());
        System.out.println("thread " + t2.t.getName() + " is alive:" + t2.t.isAlive());
        System.out.println("thread " + t3.t.getName() + " is alive:" + t3.t.isAlive());
        try {
            System.out.println("waiting for threads to finish");
            t1.t.join();
            t2.t.join();
            t3.t.join();
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");
        }
        System.out.println("thread " + t1.t.getName() + " is alive:" + t1.t.isAlive());
        System.out.println("thread " + t2.t.getName() + " is alive:" + t2.t.isAlive());
        System.out.println("thread " + t3.t.getName() + " is alive:" + t3.t.isAlive());
        System.out.println("main thread exiting");
    }
}
