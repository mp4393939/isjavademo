package day;

public class Person {
    String name, address;
    int age;

    void talk() {
        System.out.println("�ҽ�" + name + "������" + age + "��ס��" + address);
    }

    String talk2() {
        System.out.println("�ҽ�" + name + "������" + age + "��ס��" + address);
        return "java.lang.String";
    }
}
