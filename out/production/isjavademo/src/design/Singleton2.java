package design;

/*
单例模式：线程安全的懒汉式写法
懒汉模式中单例是在需要的时候才去创建的，如果单例已经创建，再次调用获取接口将不会重新创建新的对象，而是直接返回之前创建的对象。如果某个单例使用的次数少，并且创建单例消耗的资源
较多，那么就需要实现单例的按需创建，这个时候使用懒汉模式就是一个不错的选择。但是这里的懒汉模式并没有考虑线程安全问题，在多个线程可能会并发调用它的getInstance()方法，导致创建
多个实例，因此需要加锁解决线程同步问题，实现如下。
缺点： 效率低，第一次加载需要实例化，反应稍慢。每次调用getInstance方法都会进行同步，消耗不必要的资源。
 */
public class Singleton2 {
    private static Singleton2 INSTANCE;

    private Singleton2() {
    }

    public static synchronized Singleton2 getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        //getINSTANCE();
        System.out.println(getINSTANCE());
    }
}
