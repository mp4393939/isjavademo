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
        return "我叫" + this.name + "，今年" + this.age + "岁，住在" + this.address;
    }

    public static void main(String[] args) {
        Array2 message[] = {new Array2("张三", 20, "江苏南京"), new Array2("李四", 29, "浙江温州"), new Array2("王芳", 20, "广东肇庆"), new Array2("赵雪梅", 34, "北京市")};
        for (int i = 0; i < message.length; i++) {
            System.out.println(message[i].talk());
        }
    }
}
