package thread;

public class SnatchTickets implements Runnable {
    private int count = 20;

    @Override
    public void run() {
        while (true) {
            //不允许出现第0张票
            if (count < 1) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "抢到了第" + count-- + "张票");
        }
    }


    public static void main(String[] args) {
        SnatchTickets st = new SnatchTickets();
        new Thread(st, "A").start();
        new Thread(st, "B").start();
        new Thread(st, "C").start();

    }
}
