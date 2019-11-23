package Design;

//目前最为安全的实现单例的方法是通过内部静态enum的方法来实现，因为JVM会保证enum不能被反射并且构造器方法只执行一次
public class EnumSingleton {
    private EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private static enum Singleton {
        INSTANCE;

        private EnumSingleton singleton;

        //JVM会保证此方法绝对只调用一次
        private Singleton() {
            singleton = new EnumSingleton();
        }

        public EnumSingleton getInstance() {
            return singleton;
        }
    }

    public static void main(String[] args) {
        EnumSingleton obj1 = EnumSingleton.getInstance();
        EnumSingleton obj2 = EnumSingleton.getInstance();
        EnumSingleton obj3 = EnumSingleton.getInstance();
        //true
        System.out.println("obj1==obj2:" + (obj1 == obj2) + "\n" + "obj1==obj3:" + (obj1 == obj3) + "\n" + "obj2==obj3:" + (obj2 == obj3));
    }
}
