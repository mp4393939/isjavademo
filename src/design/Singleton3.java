package design;

/*
单例模式：饿汉式写法（推荐）
饿汉模式是最简单的一种实现方式，饿汉模式在类加载的时候就对实例进行创建，实例在整个程序周期 都存在。它的好处是只在类加载的时候创建一次实例，不会存在多个线程创建多个实例的情况，
避免了多线程同步的问题。它的缺点也很明显，即使这个单例没有用到也会被创建，而且在类加载之后就被创建，内存就被浪费了。
缺点：不需要的时候就加载了，造成资源浪费。
 */
public class Singleton3 {
    private static Singleton3 INSTANCE = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getINSTANCE() {

        return INSTANCE;
    }

    public static void main(String[] args) {
        //getINSTANCE();
        System.out.println(getINSTANCE());
    }
}
