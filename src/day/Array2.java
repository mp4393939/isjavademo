package day;

public class Array2 {
    String name, address;
    int age;

    public Array2(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String talk() {
        return "�ҽ�" + this.name + "������" + this.age + "�꣬ס��" + this.address;
    }

    public static void main(String[] args) {
        Array2 message[] = {new Array2("����", 20, "�����Ͼ�"), new Array2("����", 29, "�㽭����"), new Array2("����", 20, "�㶫����"), new Array2("��ѩ÷", 34, "������")};
        for (int i = 0; i < message.length; i++) {
            System.out.println(message[i].talk());
        }
    }
}
