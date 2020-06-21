package thread;

public class ThreadTickts {
    public static void main(String[] args) {
        //����Runnable�ӿڵ��������
        MyRunnable mr = new MyRunnable();
        //�����̶߳���
        Thread th1 = new Thread(mr, "����1");
        Thread th2 = new Thread(mr, "����2");
        Thread th3 = new Thread(mr, "����3");
        Thread th4 = new Thread(mr, "����4");
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}

class MyRunnable implements Runnable {
    //��ʱ����Ҫ��static����ΪRunnable�ӿڵ��������ֻ����һ��
    int tickts = 100;

    //���췽��Ҳ������д����Ϊ�������̶߳������Thread,
    //����̳�Thread��ʽ����ȥ���ø���Ĺ���
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
                //currentThread()��Thread�ľ�̬��������ȡ��ǰ�̶߳���
                System.out.println(Thread.currentThread().getName() + "----������" + tickts-- + "��Ʊ");
            }
        }

    }
}