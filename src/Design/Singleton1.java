package Design;

//单例模式：线程不安全的懒汉式写法
public class Singleton1 {
    private static Singleton1 INSTANCE;

    private Singleton1() {
    }

    public static Singleton1 getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton1();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        //getInstance();
        System.out.println(getINSTANCE());
    }
}

