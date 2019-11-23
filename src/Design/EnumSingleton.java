package Design;

//Ŀǰ��Ϊ��ȫ��ʵ�ֵ����ķ�����ͨ���ڲ���̬enum�ķ�����ʵ�֣���ΪJVM�ᱣ֤enum���ܱ����䲢�ҹ���������ִֻ��һ��
public class EnumSingleton {
    private EnumSingleton() {
    }

    public static EnumSingleton getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private static enum Singleton {
        INSTANCE;

        private EnumSingleton singleton;

        //JVM�ᱣ֤�˷�������ֻ����һ��
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
