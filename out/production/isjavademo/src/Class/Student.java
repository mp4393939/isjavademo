package Class;

/*
定义一个表示学生信息的类Student，要求如下：
（1）类Student的成员变量：
sNO　表示学号；sName表示姓名；sSex表示性别；sAge表示年龄；sJava：表示Java课程成绩。
（2）类Student带参数的构造方法：
在构造方法中通过形参完成对成员变量的赋值操作。
（3）类Student的方法成员：
getNo（）：获得学号；
getName（）：获得姓名；
getSex（）：获得性别；
getAge（）获得年龄；
getJava（）：获得Java 课程成绩
（4）根据类Student的定义，创建五个该类的对象，输出每个学生的信息，计算并输出这五个学生Java语言成绩的平均值，以及计算并输出他们Java语言成绩的最大值和最小值。
 */
//Pragramme name Student;
public class Student {
    String sNO, sName, sSex;
    int sAge, sJava;

    public Student(String XH, String XM, String XB, int NL, int XF) {
        super();
        sNO = XH;
        sName = XM;
        sSex = XB;
        sAge = NL;
        sJava = XF;
    }

    public String getNO() {
        return sNO;
    }

    public String getName() {
        return sName;
    }

    public String getSex() {
        return sSex;
    }

    public int getAge() {
        return sAge;
    }

    public int getJava() {
        return sJava;
    }

    public static void main(String[] args) {
        Student[] st = new Student[5];
        st[0] = new Student("09zc01", "张三", "男", 19, 94);
        st[1] = new Student("09zc02", "李四", "男", 20, 85);
        st[2] = new Student("09zc03", "王五", "女", 18, 96);
        st[3] = new Student("09zc04", "赵六", "男", 17, 90);
        st[4] = new Student("09zc05", "杨七", "女", 21, 88);
        int max = 0, min = 100, sum = 0;
        System.out.println("学生信息：");
        for (int i = 0; i < st.length; i++) {
            if (st[i].sJava < min) {
                min = st[i].sJava;
            }
            if (st[i].sJava > max) {
                max = st[i].sJava;
            }
            sum = sum + st[i].sJava;
            System.out.println("学生编号：" + st[i].getNO() + "，姓名：" + st[i].getName() + "，性别：" + st[i].getSex() + "，年龄：" + st[i].getAge() + "，Java课学分：" + st[i].getJava());
        }
        System.out.println();
        System.out.println("共有学生：" + st.length + "，平均成绩：" + sum / st.length);
        System.out.println("最小学分：" + min + "，最大学分：" + max);
    }
}