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
        return "我是" + this.name + ",年龄" + this.age + "岁,性别" + this.gender + ",初" + this.class_of + ",就读于" + this.school;
    }

    public static void main(String[] args) {
        Array3 message[] = {new Array3("张三", 15, "男", "一", "九江一中"), new Array3("李四", 16, "男", "三", "九江二中"), new Array3("张艳", 14, "女", "一", "九江一中"), new Array3("杨雪", 15, "女", "二", "九江二中")};
        for (int i = 0; i < message.length; i++) {
            System.out.println(message[i].talk());
        }
    }
}
