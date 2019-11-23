package Thread;

import java.lang.Thread;

public class method {
    public static void main(String args[]) throws InterruptedException {
        Thread t = new Thread();
        t.getName();
        t.getPriority();
        t.isAlive();
        t.join(5);
        t.run();
        t.sleep(5);
        t.start();
        System.out.println(t.getName() + "\n" + t.getPriority() + "\n" + t.isAlive());
    }
}
