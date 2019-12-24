package algorithm;

//1、2、3、4能组成多少无重复数字的三位数
public class ThreeDigitsWithoutRepetition2 {
    public static void main(String[] args) {
        String number[] = {"1", "2", "3", "4"};
        int total = getTotal(number.length);
        System.out.println("total=" + total);
        for (int i = 0; i < number.length; i++) {
            if (i != 0) {
                String tmp1 = number[i];
                number[i] = number[0];
                number[0] = tmp1;
            }
            for (int j = 1; j < number.length; j++) {
                for (int k = 1; k < number.length; k++) {
                    if (j != k)
                        System.out.println(number[0] + number[j] + number[k]);
                }
            }
        }
    }

    public static int getTotal(int index) {

        return index > 1 ? index * getTotal(index - 1) : 1;
    }
}
