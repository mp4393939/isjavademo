package thread;

/*
死锁是指多个进程循环等待他方占有的资源而无限的僵持下去的局面。很显然，没有外力作用，那么死锁涉及到的各个进程都将永远处于>封锁状态。计算机系统产生死锁的根本原因就是
资源有限且操作不当。
产生死锁的四个必要条件：
     1，互斥条件：即为某个资源在一段时间内只能由一个进程占有，不能同时被两个或者两个以上的进程占有。
     2，不可抢占条件：进程所获得的资源在未使用完毕之前，资源申请者不能强行从资源占有者手中夺取资源，而只能由该资源占有者自行释放。
     3，占有且申请条件：进程至少已经占有一个条件，但又申请新的资源；由于该资源已被另外进程占有，此时该进程阻塞；但是，他在等待新的资源之时，
仍然继续占有已占用的资源。
     4，换路等待：存在一个进程等待序列{P1,p2,..,pn}其中P1等待P2所占有的资源，P2等待P3占有的资源，.....，而Pn等待P1所占有的资源，形成一个
    进程循环等待环。
   上面我们说这四个条件在死锁时会同时发生。也就是说，只要有一个辟谣条件不满足，则死锁就可以排除。
 */
class Resource {
    private String name;
    private int resource;

    Resource(String name, int resource) {
        this.name = name;
        this.resource = resource;
    }

    String getName() {
        return name;
    }

    synchronized int doSome() {
        return ++resource;
    }

    synchronized void cooperate(Resource resource) {
        resource.doSome();
        System.out.printf("%s 整合 %s 的資源%n",
                this.name, resource.getName());
    }
}

public class DeadLockDemo {
    public static void main(String[] args) {
        Resource resource1 = new Resource("resource1", 10);
        Resource resource2 = new Resource("resource2", 20);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                resource1.cooperate(resource2);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                resource2.cooperate(resource1);
            }
        });

        thread1.start();
        thread2.start();
    }
}

