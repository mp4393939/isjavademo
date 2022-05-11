package design;

/*
����ģʽ����̬�ڲ��ࣨ�Ƽ���
���ַ�ʽͬ������������ػ�������ֻ֤����һ��instanceʵ�����������ģʽһ����Ҳ������������ػ��ƣ���˲����ڶ��̲߳��������⡣��һ�����ǣ��������ڲ�������ȥ��������ʵ����
�����Ļ���ֻҪӦ���в�ʹ���ڲ��࣬JVM�Ͳ���ȥ������������࣬Ҳ�Ͳ��ᴴ���������󣬴Ӷ�ʵ������ʽ���ӳټ��ء�Ҳ����˵���ַ�ʽ����ͬʱ��֤�ӳټ��غ��̰߳�ȫ��
 */
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
