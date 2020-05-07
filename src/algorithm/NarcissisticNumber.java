package algorithm;

/*
打印出1000以内的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class NarcissisticNumber {
    public static void main(String[] args) {
        int b1, b2, b3;
        for (int m = 101; m < 1000; m++) {
            b3 = m / 100;
            b2 = m % 100 / 10;
            b1 = m % 10;
            if ((b3 * b3 * b3 + b2 * b2 * b2 + b1 * b1 * b1) == m) {
                System.out.println(m + "是一个水仙花数");
            }
        }
    }
}