package security;

import java.io.*;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Scanner;

/*
��Ʊ��������������
��˫ɫ��ÿעͶע������6����ɫ������1����ɫ�������ɡ���ɫ������1--33��ѡ����ɫ������1--16��ѡ��
˫ɫ��21084�ڿ��������05 07 09 11 21 28 01>>5,7,9,11,21,28,1
4074840δȥ�� 16299360 2435457024δȥ��
*/
public class LotteryNumberGeneratorProgram {
    public static int count = 1;//�Է������ô�������

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in, "UTF-8");
            System.out.print("������Ҫ���ɵĸ���:");
            long number = sc.nextLong();
            long startTime = System.currentTimeMillis();    //��ȡ��ʼʱ��
            //�����ļ�����
            clearInfoForFile();
            for (int num = 1; num <= number; num++) {
                SecureRandom serandom = SecureRandom.getInstance("SHA1PRNG");
                int randomNumberRed1 = serandom.nextInt(12) + 1;//����1��15֮��İ�ȫ�����������15
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

                //����
                for (int i = 0; i < assemble.length; i++) {
                    for (int j = 0; j < assemble.length - i - 1; j++) {
                        if (assemble[j] > assemble[j + 1]) {
                            int temp = assemble[j];
                            assemble[j] = assemble[j + 1];
                            assemble[j + 1] = temp;
                        }
                    }
                }
                for (int j : assemble) {//���
                    //System.out.print(j + " ");
                }
                int[] newassemble = new int[7];
                System.arraycopy(assemble, 0, newassemble, 0, 6);
                newassemble[newassemble.length - 1] = randomNumberBlue;
                //System.out.println(Arrays.toString(newassemble));
                //int����ת����һ���ַ���
                if (assemble[0] != assemble[1] && assemble[0] != assemble[2] && assemble[0] != assemble[3] && assemble[0] != assemble[4] && assemble[0] != assemble[5]
                        && assemble[1] != assemble[2] && assemble[1] != assemble[3] && assemble[1] != assemble[4] && assemble[1] != assemble[5]
                        && assemble[2] != assemble[3] && assemble[2] != assemble[4] && assemble[2] != assemble[5]
                        && assemble[3] != assemble[4] && assemble[3] != assemble[5]
                        && assemble[4] != assemble[5]
                ) {
                    //System.out.print("����ȥ�غ����ɵĵ�" + count + "�����֣�");
                    toStringMethod(newassemble);
                }
            }
            System.out.println("������ɵ�ÿ��������д�����");

            long endTime = System.currentTimeMillis();    //��ȡ����ʱ��
            System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ms");    //�����������ʱ��

            String s = "5,7,9,11,21,28,1";
            boolean test = "5,7,9,11,21,28,1".equals(s);
            System.out.println(test);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    private static void toStringMethod(int[] arr) {
        // �Զ���һ���ַ���������
        StringBuilder sb = new StringBuilder();
        sb.append("");
        //����int���飬����int�����е�Ԫ��ת�����ַ������浽�ַ���������ȥ
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
            //���ı��������
            //fos.close();
            file = new FileOutputStream("LotteryNumber.txt", true);
            ps = new PrintStream(file);
            ps = new PrintStream(file);
            ps.println(sb);
            ps.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("ϵͳ�Ҳ���ָ����·��");
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

