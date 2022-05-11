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
        this.address = address;//这个构造方法一个字符都不能出错
    }

    public String talk() {
        return "员工名叫" + this.name + ",年龄" + this.age + ",性别" + this.gender + ",职位" + this.position + ",月收入￥" + this.salary + ",在" + this.address + "工作" + "\n" + "------------------------------------------------------------";
    }

    public static void main(String[] args) {
        Worker info[] = {new Worker("赵起仁", 25, "男", "电焊工", 5000.00, "江苏省南京市"),
                new Worker("王国正", 25, "男", "车床工", 5000.50, "湖南省怀化市"),
                new Worker("杨明义", 21, "男", "铣床工", 4500.00, "江苏省南京市"),
                new Worker("李凯", 29, "男", "数控工程师", 8000.67, "浙江省温州市"),
                new Worker("杨若兮", 22, "女", "前台文员", 4000.89, "广东省中山市"),
                new Worker("李雪梅", 34, "女", "高级服装没什师", 15000.50, "上海市")
        };
        for (int i = 0; i < info.length; i++) {
            System.out.println(info[i].talk());
        }
    }
}
