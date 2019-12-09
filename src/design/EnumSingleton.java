package design;

//Ŀǰ��Ϊ��ȫ��ʵ�ֵ����ķ�����ͨ���ڲ���̬enum�ķ�����ʵ�֣���ΪJVM�ᱣ֤enum���ܱ����䲢�ҹ���������ִֻ��һ��
public class EnumSingleton {
    private EnumSingleton() {
    }

    private static EnumSingleton getINSTANCE() {
        return Singleton.INSTANCE.getINSTANCE();
    }

    private static enum Singleton {
        INSTANCE;

        private EnumSingleton singleton;

        //JVM�ᱣ֤�˷�������ֻ����һ��
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
