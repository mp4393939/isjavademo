package Array;

public class Teacher {
    private String name, gender, position, address;
    private int age, exp;//experience��������
    private double salary;

    private Teacher(String name, int age, String gender, String position, double salary, int exp, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.position = position;
        this.salary = salary;
        this.exp = exp;
        this.address = address;

    }

    private String talk() {
        return this.name + "," + this.age + "��,�Ա�" + this.gender + "," + this.position + "��ʦ,�����룤" + this.salary + "," + this.exp + "���ѧ����,ס��" + this.address;
    }

    public static void main(String[] args) {
        Teacher info[] = {
                new Teacher("����ϼ", 29, "Ů", "����", 4500.00, 5, "Զ�ι�Ԣb341"),
                new Teacher("����÷", 34, "Ů", "��ѧ", 4800.00, 8, "Զ�ι�Ԣc301"),
                new Teacher("Լ���������", 28, "��", "Ӣ��", 5000, 4, "Զ�ι�Ԣb111"),
                new Teacher("���Ӻ�", 26, "��", "����", 4500.00, 1, "Զ�ι�Ԣb439"),
                new Teacher("������", 25, "��", "��ѧ", 4800.50, 2, "Զ�ι�Ԣa341"),
                new Teacher("����", 29, "��", "����", 4500.00, 2, "Զ�ι�Ԣc31"),
                new Teacher("����ˮ", 38, "��", "����", 4500.00, 2, "Զ�ι�Ԣb231"),
                new Teacher("��ѩ��", 30, "Ů", "��ʷ", 4800.00, 6, "Զ�ι�Ԣb123"),
                new Teacher("������", 45, "��", "����", 4500.00, 6, "Զ�ι�Ԣa180"),
                new Teacher("Ǯ�", 30, "��", "����", 4500.00, 3, "Զ�ι�Ԣc101"),
        };
        for (Teacher out : info) {
            System.out.println("---------------------------------------------------------------" + "\n" + out.talk());
        }
    }
}
