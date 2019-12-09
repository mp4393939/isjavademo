package array;

public class Worker {
    String name, gender, position, address;
    int age;
    double salary;

    public Worker(String name, int age, String gender, String position, double salary, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
        this.address = address;//������췽��һ���ַ������ܳ���
    }

    public String talk() {
        return "Ա������" + this.name + ",����" + this.age + ",�Ա�" + this.gender + ",ְλ" + this.position + ",�����룤" + this.salary + ",��" + this.address + "����" + "\n" + "------------------------------------------------------------";
    }

    public static void main(String[] args) {
        Worker info[] = {new Worker("������", 25, "��", "�纸��", 5000.00, "����ʡ�Ͼ���"),
                new Worker("������", 25, "��", "������", 5000.50, "����ʡ������"),
                new Worker("������", 21, "��", "ϳ����", 4500.00, "����ʡ�Ͼ���"),
                new Worker("�", 29, "��", "���ع���ʦ", 8000.67, "�㽭ʡ������"),
                new Worker("������", 22, "Ů", "ǰ̨��Ա", 4000.89, "�㶫ʡ��ɽ��"),
                new Worker("��ѩ÷", 34, "Ů", "�߼���װûʲʦ", 15000.50, "�Ϻ���")
        };
        for (int i = 0; i < info.length; i++) {
            System.out.println(info[i].talk());
        }
    }
}
