package loop;

public class recursion {
    public static void main(String[] args) {
        int Sum = 0;

        for (int i = 0; i <= 100; i++) {
            Sum = Sum + i;
        }
        System.out.println(Sum);

        int sum = 0;
        System.out.println(sum(100));
    }
    //ตÝน้
    public static int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);
    }
}