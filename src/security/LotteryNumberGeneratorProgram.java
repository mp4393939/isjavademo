package security;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Scanner;
/*
彩票号码生成器程序
“双色球”每注投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1--33中选择；蓝色球号码从1--16中选择
双色球21084期开奖结果：05 07 09 11 21 28 01>>5,7,9,11,21,28,1
*/
public class LotteryNumberGeneratorProgram {public static void main(String[] args) {
    try {
        Scanner sc = new Scanner(System.in,"UTF-8");
        System.out.print("请输入要生成的数字个数:");
        int number = sc.nextInt();
        long startTime = System.currentTimeMillis();    //获取开始时间
        for (int num = 1; num <= number; num++) {
            SecureRandom serandom = SecureRandom.getInstance("SHA1PRNG");
            int randomNumberRed1 = serandom.nextInt(6) + 1;//生成1－15之间的安全随机数，包括15
            //int randomNumberRed1 = 5;
            int randomNumberRed2 = serandom.nextInt(15) + 1;
            //int randomNumberRed2 = 7;
            int randomNumberRed3 = serandom.nextInt(30) + 1;
            //int randomNumberRed3 = 9;
            int randomNumberRed4 = serandom.nextInt(31) + 1;
            //int randomNumberRed4 = 11;
            int randomNumberRed5 = serandom.nextInt(32) + 1;
            //int randomNumberRed5 = 21;
            int randomNumberRed6 = serandom.nextInt(33) + 1;
            //int randomNumberRed6 = 28;
            int randomNumberBlue = serandom.nextInt(2) + 1;
                /*System.out.println(randomNumberRed1);
                System.out.println(randomNumberRed2);
                System.out.println(randomNumberRed3);
                System.out.println(randomNumberRed4);
                System.out.println(randomNumberRed5);
                System.out.println(randomNumberRed6);
                System.out.println(randomNumberBlue);*/
            int[] assemble = {randomNumberRed1, randomNumberRed2, randomNumberRed3, randomNumberRed4, randomNumberRed5, randomNumberRed6};
            //System.out.println(assemble[0] + "," + assemble[1] + "," + assemble[2] + "," + assemble[3] + "," + assemble[4] + "," + assemble[5] + "+" + assemble[6]);
                /*Arrays.sort(assemble);
                System.out.println(Arrays.toString(assemble));*/

                for (int i = 0; i < assemble.length; i++) {
                    for (int j = 0; j < assemble.length - i - 1; j++) {
                        if (assemble[j] > assemble[j + 1]) {
                            int temp = assemble[j];
                            assemble[j] = assemble[j + 1];
                            assemble[j + 1] = temp;
                        }
                    }
                }
                for (int j : assemble) {//输出
                    //System.out.print(j + " ");
                }

            int[] newassemble = new int[7];
            System.arraycopy(assemble, 0, newassemble, 0, 6);
            newassemble[newassemble.length - 1] = randomNumberBlue;
            //System.out.println(Arrays.toString(newassemble));
            //int数组转换成一个字符串
            toStringMethod(newassemble);
        }
        long endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间

        String s = "5,7,9,11,21,28,1";
        boolean test = "5,7,9,11,21,28,1".equals(s);
        System.out.println(test);
    } catch (NoSuchAlgorithmException e) {
        e.printStackTrace();
    }
}
    private static void toStringMethod(int[] arr) {
        // 自定义一个字符缓冲区，
        StringBuilder sb = new StringBuilder();
        sb.append("");
        //遍历int数组，并将int数组中的元素转换成字符串储存到字符缓冲区中去
        for(int i=0;i<arr.length;i++)
        {
            if(i!=arr.length-1)
                sb.append(arr[i]+",");
            else
                sb.append(arr[i]+"");
        }
        System.out.println(sb);
    }

}

