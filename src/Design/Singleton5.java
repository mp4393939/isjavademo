package Design;

//����ģʽ��˫��У����(DCLʵ�ֵ���)
/*
�ŵ㣺��Դ�����ʸߣ���һ��ִ�з����ǵ�������Żᱻʵ������
ȱ�㣺��һ�μ���ʱ��������jdk1.5֮֮ǰ�п��ܻ���ػ�ʧ�ܡ�
����д�������������ڿ�������õģ���δ��������������getInstance()�����н�����˫�ص��жϣ���һ���жϵ���Ҫ�����˲���Ҫ��ͬ�����ڶ����ж���Ϊ����null���������ȥ����ʵ�����ٸ�
�򵥵����ӣ����������ж���߳�ͬʱ�����������: �߳�Aִ�е�nstance = new Singleton(),�����µ�����������:
(1)����Singletonʵ�������ڴ棬������ѹջ�����������������͡�
(2)����ʼ�����캯���Լ�������ֶΣ��ڶ��ڴ濪�ٿռ䡣
(3)����instance����ָ�������ڴ�ռ䡣
 */
public class Singleton5 {
    //volatile��Ϊava��������С�����Ƶ����ߵĹؼ��֡��������ڱ����ڴ�ɼ��Ժͷ�ָֹ��������
    private volatile static Singleton5 instance;

    //����д��
    //private static Singleton5 instance;
    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        if (instance == null) {
            synchronized (Singleton5.class) {
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        //getInstance();
        System.out.println(getInstance());
    }
}
