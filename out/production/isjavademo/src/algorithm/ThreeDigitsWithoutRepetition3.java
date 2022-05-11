package algorithm;


//有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
public class ThreeDigitsWithoutRepetition3 {
    public static void main(String[] args) {

        long starTime = System.currentTimeMillis();
        int count = 0;
        for (int x = 1; x < 5; x++) {
            for (int y = 1; y < 5; y++) {
                for (int z = 1; z < 5; z++) {
                    if (x != y && y != z && x != z) {
                        count++;
                        System.out.println(x * 100 + y * 10 + z);
                    }
                }
            }
        }
        System.out.println("共有" + count + "个三位数");
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - starTime) + "ms");
    }

}