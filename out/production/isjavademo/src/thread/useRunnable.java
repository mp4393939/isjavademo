package thread;

class newthread implements Runnable {
    Thread t;

    newthread() {
        //创建一个新的线程
        t = new Thread(this, "Demo thread");
        System.out.println("child thread:" + t);
        //start the thread
        t.start();
    }

    //this is the entry point for the second thread
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("child thread:" + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("child interrupted:");
        }
        System.out.println("child thread exiting");
    }
}

class useRunnable {
    public static void main(String args[]) {
        new newthread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("main thread:" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted:");
        }
        System.out.println("main thread exiting");
    }
}
