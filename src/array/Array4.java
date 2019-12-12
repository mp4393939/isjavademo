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

        return this.name + ",年龄" + this.age + "岁,手机号码是" + this.phone + ",住在" + this.address;
    }

    public static void main(String[] args) {
        Array4 mess[] = {
                new Array4("赵处燕", 23, "13263026403", "江西省抚州市"),
                new Array4("王万口", 28, "13245316217", "江西省赣州市"),
                new Array4("李三回", 23, "13263026403", "江西省南昌市"),
                new Array4("都菡儿", 19, "16302605482", "江西省鹰潭市"),
                new Array4("韩雪儿", 26, "13221845803", "江西省吉安市")
        };
        for (int i = 0; i < mess.length; i++) {
            System.out.println(mess[i].talk());
        }
    }
}
