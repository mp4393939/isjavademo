package design;

public class TestStaticProxy {
    public static void main(String[] args) {
        ProxyInterface proxyInterface = new WeddingCompany(new NormalHome());
        proxyInterface.marry();
    }
}

//���칫˾�ࣺ���칫˾�൱�ڴ����ɫ
class WeddingCompany implements ProxyInterface {

    private ProxyInterface proxyInterface;

    WeddingCompany(ProxyInterface proxyInterface) {
        this.proxyInterface = proxyInterface;
    }

    @Override
    public void marry() {
        System.out.println("�����ǻ��칫˾��");
        System.out.println("�����������ǰ��׼������");
        System.out.println("��Ŀ����...");
        System.out.println("���ﹺ��...");
        System.out.println("������Ա�ֹ�...");
        System.out.println("���Կ�ʼ�����");
        proxyInterface.marry();
        System.out.println("�����ϣ�������Ҫ�������������ǿ��Իؼ��ˣ�������������ǹ�˾����");
    }
}

//����ͥ��
class NormalHome implements ProxyInterface {

    @Override
    public void marry() {
        System.out.println("���ǽ������");
    }
}