package security;

import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Scanner;

/*
彩票号码生成器程序
“双色球”每注投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1--33中选择；蓝色球号码从1--16中选择
双色球21084期开奖结果：05 07 09 11 21 28 01>>5,7,9,11,21,28,1
4074840未去重 16299360 2435457024未去重
*/
public class LotteryNumberGeneratorProgram {
    public static int count = 1;//对方法调用次数计数

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in, "UTF-8");
            System.out.print("请输入要生成的个数:");
            long number = sc.nextLong();
            long startTime = System.currentTimeMillis();    //获取开始时间
            //清理文件内容
            clearInfoForFile();
            for (int num = 1; num <= number; num++) {
                SecureRandom serandom = SecureRandom.getInstance("SHA1PRNG");
                int randomNumberRed1 = serandom.nextInt(12) + 1;//生成1－15之间的安全随机数，包括15
                //int randomNumberRed1 = 5;
                int randomNumberRed2 = serandom.nextInt(21) + 1;
                //int randomNumberRed2 = 7;
                int randomNumberRed3 = serandom.nextInt(22) + 1;
                //int randomNumberRed3 = 9;
                int randomNumberRed4 = serandom.nextInt(26) + 1;
                //int randomNumberRed4 = 11;
                int randomNumberRed5 = serandom.nextInt(32) + 1;
                //int randomNumberRed5 = 21;
                int randomNumberRed6 = serandom.nextInt(33) + 1;
                //int randomNumberRed6 = 28;
                int randomNumberBlue = serandom.nextInt(16) + 1;
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

                //排序
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
                if (assemble[0] != assemble[1] && assemble[0] != assemble[2] && assemble[0] != assemble[3] && assemble[0] != assemble[4] && assemble[0] != assemble[5]
                        && assemble[1] != assemble[2] && assemble[1] != assemble[3] && assemble[1] != assemble[4] && assemble[1] != assemble[5]
                        && assemble[2] != assemble[3] && assemble[2] != assemble[4] && assemble[2] != assemble[5]
                        && assemble[3] != assemble[4] && assemble[3] != assemble[5]
                        && assemble[4] != assemble[5]
                ) {
                    //System.out.print("数组去重后生成的第" + count + "组数字：");
                    toStringMethod(newassemble);
                }
            }
            System.out.println("随机生成的每组数字已写入磁盘");

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
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1)
                sb.append(arr[i] + ",");
            else
                sb.append(arr[i] + "");
        }
        //System.out.println(sb);
        FileOutputStream file;
        PrintStream ps = null;
        try {
            //FileOutputStream fos = new FileOutputStream(new File("LotteryNumber.txt"));
            //将文本内容清空
            //fos.close();
            file = new FileOutputStream("LotteryNumber.txt", true);
            ps = new PrintStream(file);
            ps = new PrintStream(file);
            ps.println(sb);
            ps.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("系统找不到指定的路径");
        }
        if (ps != null) {
            ps.close();
        }
        count++;
    }

    public static void clearInfoForFile() {
        File f = new File("LotteryNumber.txt");
        try {
            if (!f.exists()) {
                f.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write("");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

