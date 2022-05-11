package time;

public class GetTime {
    public static void main(String[] args) {
        final int N = 100000;

        //演示低效的方法拼接字符串
        long starTime = System.currentTimeMillis();
        String str = "*";
        for (int i = 0; i < N; i++) {
            str += "*";

        }
        long endTime = System.currentTimeMillis();
        System.out.println("+=用时：" + (endTime - starTime) + "毫秒");


        //使用StringBuffer进行字符串拼接（自接对内存进行修改）大约是前面的（+=）1000倍
        starTime = System.currentTimeMillis();
        StringBuffer str1 = new StringBuffer("*");
        for (int i = 0; i < N; i++) {
            str1.append("*");
            //拼接 追加
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的append用时：" + (endTime - starTime) + "毫秒");

        //StringBuffer的加强版 StringBuilder java1.5以后，StringBuilder效率大约是前面的StringBuffer的45倍
        starTime = System.currentTimeMillis();
        StringBuilder str2 = new StringBuilder("*");
        for (int i = 0; i < N; i++) {

        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的append用时：" + (endTime - starTime) + "毫秒");
    }

}
