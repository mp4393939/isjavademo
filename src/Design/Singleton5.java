package Design;

/*
����ģʽ��˫��У����(Double check lockʵ�ֵ���)
�ŵ㣺��Դ�����ʸߣ���һ��ִ�з����ǵ�������Żᱻʵ������
ȱ�㣺��һ�μ���ʱ��������jdk1.5֮ǰ�п��ܻ���ػ�ʧ�ܡ�
����д�������������ڿ�������õģ���δ��������������getINSTANCE()�����н�����˫�ص��жϣ���һ���жϵ���Ҫ�����˲���Ҫ��ͬ�����ڶ����ж���Ϊ����null���������ȥ����ʵ����
�ٸ��򵥵����ӣ����������ж���߳�ͬʱ�����������: �߳�Aִ�е�INSTANCE = new Singleton(),�����µ�����������:
1����Singletonʵ�������ڴ棬������ѹջ�����������������͡�
2����ʼ�����캯���Լ�������ֶΣ��ڶ��ڴ濪�ٿռ䡣
3����INSTANCE����ָ�������ڴ�ռ䡣
 */
public class Singleton5 {
    //volatile��Ϊjava��������С�����Ƶ����ߵĹؼ��֡��������ڱ����ڴ�ɼ��Ժͷ�ָֹ��������
    private volatile static Singleton5 INSTANCE;

    //����д��
    //private static Singleton5 INSTANCE;
    private Singleton5() {
    }

    private static Singleton5 getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (Singleton5.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton5();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        //getINSTANCE();
        System.out.println(getINSTANCE());
    }
}
