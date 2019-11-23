package Design;

//����ģʽ���̲߳���ȫ������ʽд��
public class Singleton1 {
    private static Singleton1 Singleton1;

    private Singleton1() {
    }


    public static Singleton1 getInstance() {
        if (Singleton1 == null) {
            Singleton1 = new Singleton1();
        }
        return Singleton1;
    }

    public static void main(String[] args) {
        //getInstance();
        System.out.println(getInstance());
    }
}

