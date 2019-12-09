package thread;

class newthread3 implements Runnable {
    String name;
    Thread t;

    newthread3(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("new thread:" + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted");
        }
        System.out.println(name + " exiting");
    }
}

public class multiple {
    public static void main(String[] args) {
        new newthread3("one");
        new newthread3("two");
        new newthread3("three");
        try {
            /*for(int i=5;i>0;i--){
                System.out.println("main thread:"+i);
                thread.sleep(5000);
            }*/
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted:");
        }
        System.out.println("main thread exiting");
    }
}
