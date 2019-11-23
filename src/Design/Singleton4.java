package Design;

//����ģʽ����̬�ڲ��ࣨ�Ƽ���
public class Singleton4 {
    private static class SingletonHolder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    private Singleton4() {
    }

    public static final Singleton4 getInstance() {

        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        //getInstance();
        System.out.println(getInstance());
    }
}
