package array;

public class method1 {
    public static void main(String[] args) {
        say();
        sayHello("laowang");
        double d = sum();
        int n = plus(5, 6);
        System.out.print("��main�������ݵ�ֵ" + d + "\n" + n);
    }

    public static void say() {
    }

    ;

    //�޷���ֵ�޲���
    public static void sayHello(String name) {
    }

    ;

    //�޷���ֵ�в���
    public static double sum() {//�з���ֵ�޲���
        System.out.println(5.5);
        return 55.5;
    }

    public static int plus(int a, int b) {
        //�з���ֵ�в���
        System.out.println(a * b);
        return a + b;
    }


}
