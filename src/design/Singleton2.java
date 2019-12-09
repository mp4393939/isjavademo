package design;

/*
����ģʽ���̰߳�ȫ������ʽд��
����ģʽ�е���������Ҫ��ʱ���ȥ�����ģ���������Ѿ��������ٴε��û�ȡ�ӿڽ��������´����µĶ��󣬶���ֱ�ӷ���֮ǰ�����Ķ������ĳ������ʹ�õĴ����٣����Ҵ����������ĵ���Դ
�϶࣬��ô����Ҫʵ�ֵ����İ��贴�������ʱ��ʹ������ģʽ����һ�������ѡ�񡣵������������ģʽ��û�п����̰߳�ȫ���⣬�ڶ���߳̿��ܻᲢ����������getInstance()���������´���
���ʵ���������Ҫ��������߳�ͬ�����⣬ʵ�����¡�
ȱ�㣺 Ч�ʵͣ���һ�μ�����Ҫʵ��������Ӧ������ÿ�ε���getInstance�����������ͬ�������Ĳ���Ҫ����Դ��
 */
public class Singleton2 {
    private static Singleton2 INSTANCE;

    private Singleton2() {
    }

    public static synchronized Singleton2 getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton2();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        //getINSTANCE();
        System.out.println(getINSTANCE());
    }
}
