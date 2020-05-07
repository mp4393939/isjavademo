package Class;

//父类和子类的方法都会执行
//构造方法可以重载
public class UseExtends extends UseB {
    public UseExtends() {
        System.out.println("This is UseExtends Construction method");
    }

    public UseExtends(String a) {
        System.out.println("重载UseExtends构造方法");
    }

    public static void main(String[] args) {
        UseExtends ue1 = new UseExtends();
        System.out.println("--------------------------------------------------------------");
        UseA ue2 = new UseA("");
        System.out.println("--------------------------------------------------------------");
        //此处UseA的无参的构造方法会执行一次
        UseB ue3 = new UseB("");
        System.out.println("--------------------------------------------------------------");
        //此处UseA、UseB的无参的构造方法会执行一次
        UseExtends ue4 = new UseExtends("");

    }
}

class UseA {
    public UseA() {
        System.out.println("This is UseA Construction method");
    }

    public UseA(String a) {
        System.out.println("重载UseA构造方法");
    }
}

class UseB extends UseA {
    public UseB() {
        System.out.println("This is UseB Construction method");
    }

    public UseB(String a) {
        System.out.println("重载UseB构造方法");
    }
}