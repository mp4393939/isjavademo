package thread;

public class ThreadTickts {
    public static void main(String[] args) {
        //创建Runnable接口的子类对象
        MyRunnable mr = new MyRunnable();
        //创建线程对象
        Thread th1 = new Thread(mr, "窗口1");
        Thread th2 = new Thread(mr, "窗口2");
        Thread th3 = new Thread(mr, "窗口3");
        Thread th4 = new Thread(mr, "窗口4");
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}

class MyRunnable implements Runnable {
    //此时不需要加static，因为Runnable接口的子类对象只创建一个
    int tickts = 100;

    //构造方法也不用重写，因为开启的线程对象就是Thread,
    //不像继承Thread方式那样去调用父类的构造
    @Override
    public void run() {

        while (true) {
            synchronized (ThreadTickts.class) {
                if (tickts < 1) {
                    break;
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //currentThread()是Thread的静态方法，获取当前线程对象
                System.out.println(Thread.currentThread().getName() + "----正在卖" + tickts-- + "张票");
            }
        }

    }
}