package algorithm;


public class Summation {
    public static void main(String[] args) {
        Summation s = new Summation();
        int n = 10;
        System.out.println(s.Sum(n));
        System.out.println(s.ForTest(n));
        System.out.println(s.WhileTest(n));
        System.out.println(s.doWhileTest(n));
    }

    //求1+2+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字以及条件判断语句(A? B:C)
    private int Sum(int n) {
        try {
            int[] array = new int[n - 2];
            return n + Sum(n - 1);
        } catch (Exception e) {
            return 1;
        }
    }

    private int ForTest(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += i;
        }
        return count;
    }

    private int WhileTest(int n) {
        int count = 0;
        int j = 1;
        while (j < n) {
            j++;
            count += j;
        }
        return count + 1;
    }

    private int doWhileTest(int n) {
        int count = 0;
        int k = 1;
        do {
            k++;
            count += k;
        }
        while (k < n);
        return count + 1;
    }
}
