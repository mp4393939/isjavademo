package Interface;

//���ýӿڱ�����ýӿڵ�ȫ������
public class test_interface implements Expandable {
    @Override
    public void expand() {

        System.out.println("test_interface");
    }

    @Override
    public void expand2(int a) {
        System.out.println("i��ʼֵ:" + i + "\t" + "j��ʼֵ:" + j);
        double i2 = i;//�ı�ӿڵ�ʵ����������������
        float j2 = j;
        System.out.println("i���κ��ֵ:" + i2 + "\t" + "���κ��ֵ:" + j2);
        i2 = 100.00;//�ı�ӿڵ�ʵ��������ֵ
        j2 = 15000000;
        System.out.println("��i���¸�ֵ���ֵ:" + i2 + "\t" + "��i���¸�ֵ���ֵ:" + j2);
        System.out.println("a:" + a);
        ;

    }

    public static void main(String[] args) {
        test_interface test = new test_interface();
        test.expand();
        test.expand2(666);
    }

}
