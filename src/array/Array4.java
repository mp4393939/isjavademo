package array;

public class Array4 {
    String name, phone, address;
    int age;

    public Array4(String name, int age, String phone, String address) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public String talk() {

        return this.name + ",����" + this.age + "��,�ֻ�������" + this.phone + ",ס��" + this.address;
    }

    public static void main(String[] args) {
        Array4 mess[] = {
                new Array4("�Դ���", 23, "13263026403", "����ʡ������"),
                new Array4("�����", 28, "13245316217", "����ʡ������"),
                new Array4("������", 23, "13263026403", "����ʡ�ϲ���"),
                new Array4("���ն�", 19, "16302605482", "����ʡӥ̶��"),
                new Array4("��ѩ��", 26, "13221845803", "����ʡ������")
        };
        for (int i = 0; i < mess.length; i++) {
            System.out.println(mess[i].talk());
        }
    }
}
