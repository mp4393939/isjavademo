package design;

//目前最为安全的实现单例的方法是通过内部静态enum的方法来实现，因为JVM会保证enum不能被反射并且构造器方法只执行一次
public class EnumSingleton {
    private EnumSingleton() {
    }

    private static EnumSingleton getINSTANCE() {
        return Singleton.INSTANCE.getINSTANCE();
    }

    private static enum Singleton {
        INSTANCE;

        private EnumSingleton singleton;

        //JVM会保证此方法绝对只调用一次
        private Singleton() {
            singleton = new EnumSingleton();
        }

        public EnumSingleton getINSTANCE() {
            return singleton;
        }
    }

    public static void main(String[] args) {
        EnumSingleton obj1 = EnumSingleton.getINSTANCE();
        EnumSingleton obj2 = EnumSingleton.getINSTANCE();
        EnumSingleton obj3 = EnumSingleton.getINSTANCE();
        //true
        System.out.println("obj1==obj2:" + (obj1 == obj2) + "\n" + "obj1==obj3:" + (obj1 == obj3) + "\n" + "obj2==obj3:" + (obj2 == obj3));
    }
}
