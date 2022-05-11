package array;

public class method1 {
    public static void main(String[] args) {
        say();
        sayHello("laowang");
        double d = sum();
        int n = plus(5, 6);
        System.out.print("在main方法传递的值" + d + "\n" + n);
    }

    public static void say() {
    }

    ;

    //无返回值无参数
    public static void sayHello(String name) {
    }

    ;

    //无返回值有参数
    public static double sum() {//有返回值无参数
        System.out.println(5.5);
        return 55.5;
    }

    public static int plus(int a, int b) {
        //有返回值有参数
        System.out.println(a * b);
        return a + b;
    }


}
