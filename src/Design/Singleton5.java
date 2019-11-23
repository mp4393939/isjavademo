package Design;

//单例模式：双重校验锁(DCL实现单例)
/*
优点：资源利用率高，第一次执行方法是单例对象才会被实例化。
缺点：第一次加载时会稍慢，jdk1.5之之前有可能会加载会失败。
这种写法估计是我们在开发中最常用的，这次代码的亮点是是在getInstance()方法中进行了双重的判断，第一层判断的主要避免了不必要的同步，第二层判断是为了在null的情况下再去创建实例；举个
简单的列子：假如现在有多个线程同时触发这个方法: 线程A执行到nstance = new Singleton(),它大致的做了三件事:
(1)、给Singleton实例分配内存，将函数压栈，并且申明变量类型。
(2)、初始化构造函数以及里面的字段，在堆内存开辟空间。
(3)、将instance对象指向分配的内存空间。
 */
public class Singleton5 {
    //volatile作为ava并发编程中“出现频率最高的关键字”，常用于保持内存可见性和防止指令重排序
    private volatile static Singleton5 instance;

    //基础写法
    //private static Singleton5 instance;
    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        //getInstance();
        System.out.println(getInstance());
    }
}
