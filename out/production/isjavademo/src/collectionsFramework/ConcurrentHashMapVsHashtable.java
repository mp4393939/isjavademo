package collectionsFramework;
/*
HashMap��Hashtable��ConccurentHashMap���ߵ�����
HashMap�̲߳���ȫ������+����+�����
Hashtable�̰߳�ȫ����ס������������+����
ConccurentHashMap�̰߳�ȫ��CAS+ͬ����������+����+�����
HashMap��key��value����Ϊnull�������������С�
 */

import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//��δ����У�����10�����̣߳�ÿ���߳���map�в���10�����ֵ�ԣ�Ȼ������ʱ.����ConcurrentHashMap��Hashtable�����ܶԱ�
public class ConcurrentHashMapVsHashtable {
    private static int INPUT_NUMBER = 100000;

    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> chm = new ConcurrentHashMap<>(12 * INPUT_NUMBER);
        long begin1 = System.currentTimeMillis();
        ExecutorService service1 = Executors.newCachedThreadPool();
        System.out.println("ConcurrentHashMap��");
        for (int i = 0; i < 10; i++) {
            service1.execute(new InputWorker(chm, i));
        }
        service1.shutdown();
        service1.awaitTermination(1, TimeUnit.DAYS);
        long end1 = System.currentTimeMillis();
        System.out.println("span time = " + (end1 - begin1) + "ms, map size = " + chm.size());
        System.out.println("-----------------------------------------------------");

        Map<Integer, String> ht = new Hashtable<>(12 * INPUT_NUMBER);
        long begin2 = System.currentTimeMillis();
        ExecutorService service2 = Executors.newCachedThreadPool();
        System.out.println("Hashtable��");
        for (int i = 0; i < 10; i++) {
            service2.execute(new InputWorker(ht, i));
        }
        service2.shutdown();
        service2.awaitTermination(1, TimeUnit.DAYS);
        long end2 = System.currentTimeMillis();
        System.out.println("span time = " + (end2 - begin2) + "ms, map size = " + ht.size());
    }

    private static class InputWorker implements Runnable {
        private static Random rand = new Random(System.currentTimeMillis());
        private final Map<Integer, String> map;
        private final int flag;

        private InputWorker(Map<Integer, String> map, int begin) {
            this.map = map;
            this.flag = begin;
        }

        @Override
        public void run() {
            int input = 0;
            while (input < INPUT_NUMBER) {
                int x = rand.nextInt();
                if (!map.containsKey(x)) {
                    map.put(x, "Alex Wang" + x);
                    input++;
                }
            }
            System.out.println("InputWorker " + flag + " is over.");
        }
    }
}
