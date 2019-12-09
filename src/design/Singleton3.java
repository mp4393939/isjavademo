package design;

/*
����ģʽ������ʽд�����Ƽ���
����ģʽ����򵥵�һ��ʵ�ַ�ʽ������ģʽ������ص�ʱ��Ͷ�ʵ�����д�����ʵ���������������� �����ڡ����ĺô���ֻ������ص�ʱ�򴴽�һ��ʵ����������ڶ���̴߳������ʵ���������
�����˶��߳�ͬ�������⡣����ȱ��Ҳ�����ԣ���ʹ�������û���õ�Ҳ�ᱻ�����������������֮��ͱ��������ڴ�ͱ��˷��ˡ�
ȱ�㣺����Ҫ��ʱ��ͼ����ˣ������Դ�˷ѡ�
 */
public class Singleton3 {
    private static Singleton3 INSTANCE = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getINSTANCE() {

        return INSTANCE;
    }

    public static void main(String[] args) {
        //getINSTANCE();
        System.out.println(getINSTANCE());
    }
}
