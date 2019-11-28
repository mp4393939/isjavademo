package Design;

//����ģʽ���̲߳���ȫ������ʽд��
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

