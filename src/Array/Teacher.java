package Array;

public class Teacher {
    private String name, gender, position, address;
    private int age, exp;//experience工作经验
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
        return this.name + "," + this.age + "岁,性别" + this.gender + "," + this.position + "老师,月收入￥" + this.salary + "," + this.exp + "年教学经验,住在" + this.address;
    }

    public static void main(String[] args) {
        Teacher info[] = {
                new Teacher("任月霞", 29, "女", "语文", 4500.00, 5, "远涛公寓b341"),
                new Teacher("王秋梅", 34, "女", "数学", 4800.00, 8, "远涛公寓c301"),
                new Teacher("约翰·尼德普", 28, "男", "英语", 5000, 4, "远涛公寓b111"),
                new Teacher("孙子涵", 26, "男", "物理", 4500.00, 1, "远涛公寓b439"),
                new Teacher("赵蓝天", 25, "男", "化学", 4800.50, 2, "远涛公寓a341"),
                new Teacher("绍荣", 29, "男", "生物", 4500.00, 2, "远涛公寓c31"),
                new Teacher("王德水", 38, "男", "政治", 4500.00, 2, "远涛公寓b231"),
                new Teacher("孙雪儿", 30, "女", "历史", 4800.00, 6, "远涛公寓b123"),
                new Teacher("刘云正", 45, "男", "地理", 4500.00, 6, "远涛公寓a180"),
                new Teacher("钱斐", 30, "男", "体育", 4500.00, 3, "远涛公寓c101"),
        };
        for (Teacher out : info) {
            System.out.println("---------------------------------------------------------------" + "\n" + out.talk());
        }
    }
}
