package string;

public class IntChangString1 extends IntChangString {
    public static void main(String[] args) {
        IntChangString sc = new IntChangString1();
        System.out.println("--------------------------------------------");
        long starTime = System.currentTimeMillis();
        final int N = 100000;
        for (int i = 0; i < N; i++) {
        }
        sc.add(123);
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - starTime) + "ms");

        System.out.println("--------------------------------------------");
        starTime = System.currentTimeMillis();
        sc.valueOf(123);
        endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - starTime) + "ms");

        System.out.println("--------------------------------------------");
        starTime = System.currentTimeMillis();
        sc.toString(123);
        endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - starTime) + "ms");
    }
}
