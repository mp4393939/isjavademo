package Array;

public class Array3 {
    String name, gender, class_of, school;
    int age;

    public Array3(String name, int age, String gender, String class_of, String school) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.class_of = class_of;
        this.school = school;
    }

    public String talk() {
        return "����" + this.name + ",����" + this.age + "��,�Ա�" + this.gender + ",��" + this.class_of + ",�Ͷ���" + this.school;
    }

    public static void main(String[] args) {
        Array3 message[] = {new Array3("����", 15, "��", "һ", "�Ž�һ��"), new Array3("����", 16, "��", "��", "�Ž�����"), new Array3("����", 14, "Ů", "һ", "�Ž�һ��"), new Array3("��ѩ", 15, "Ů", "��", "�Ž�����")};
        for (int i = 0; i < message.length; i++) {
            System.out.println(message[i].talk());
        }
    }
}
