package collectionsFramework;
/*
HashMap、Hashtable、ConccurentHashMap三者的区别
HashMap线程不安全，数组+链表+红黑树
Hashtable线程安全，锁住整个对象，数组+链表
ConccurentHashMap线程安全，CAS+同步锁，数组+链表+红黑树
HashMap的key，value均可为null，其他两个不行。
 */

import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//这段代码中，生成10个子线程，每个线程向map中插入10万个键值对，然后计算耗时.测试ConcurrentHashMap与Hashtable的性能对比
public class ConcurrentHashMapVsHashtable {
    private static int INPUT_NUMBER = 100000;

    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> chm = new ConcurrentHashMap<>(12 * INPUT_NUMBER);
        long begin1 = System.currentTimeMillis();
        ExecutorService service1 = Executors.newCachedThreadPool();
        System.out.println("ConcurrentHashMap：");
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
        System.out.println("Hashtable：");
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
