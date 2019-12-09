package design;

/*
������ģʽ����������ȫ��ͬ��������ϵ��һ�𣬾�����ʵ�����еı�ѹ��������һ���ֻ��������Ҫ�ĵ�ѹ��20V�����������ĵ�ѹ��220V����ʱ�����Ҫһ����ѹ
������220V�ĵ�ѹת����20V�ĵ�ѹ����������ѹ���ͽ�20V�ĵ�ѹ���ֻ���ϵ�����ˡ�
 */
public class TestAdapterMode {
    public static void main(String[] args) {
        Phone phone = new Phone();
        VoltageAdapter adapter = new VoltageAdapter();
        phone.setAdapter(adapter);
        phone.charge();
    }
}

// �ֻ���
class Phone {

    // ������ѹ220v����һ������
    static final int V = 220;

    private VoltageAdapter adapter;

    // ���
    void charge() {
        adapter.changeVoltage();
    }

    void setAdapter(VoltageAdapter adapter) {
        this.adapter = adapter;
    }
}

// ��ѹ��
class VoltageAdapter {
    // �ı��ѹ�Ĺ���
    void changeVoltage() {
        System.out.println("���ڳ��...");
        System.out.println("ԭʼ��ѹ��" + Phone.V + "V");
        System.out.println("������ѹ��ת��֮��ĵ�ѹ:" + (Phone.V - 200) + "V");
    }
}