package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class FileDivision {

    public void division() {

        Scanner input = new Scanner(System.in);
        System.out.println("\n����Ҫ�ָ���ļ���  ���磺C:\\Users\\Administrator\\IdeaProjects\\isjavademo\\src\\io\\source.txt��");
        String src = input.nextLine();

        File file = new File(src);
        if (!file.exists() || !file.isFile()) {
            System.out.println("�Ҳ�������ļ���");
            return;
        }

        System.out.println("�ָ���  ��λ��byte");
        long size = input.nextLong();

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream bos = null;

            long sum = 0;//������
            long s = file.length();//�ļ��Ĵ�С
            int part = 0;

            //������ļ��ָ�ɼ���
            if (s % size == 0) {
                part = (int) (s / size);
            } else {
                part = (int) (s / size) + 1;
            }

            byte[] bytes = new byte[1];
            int len = -1;
            System.out.println("\n���ڷָ����������");

            for (int i = 0; i < part; i++) {
                System.out.println("��" + (i + 1) + "��...");
                bos = new BufferedOutputStream(new FileOutputStream(src + "-(" + (i + 1) + ").txt"));
                //bos = new BufferedOutputStream(new FileOutputStream(src+"_"+(i+1)+".txt"));

                //��ȡ������ļ�
                while ((len = bis.read(bytes)) != -1) {
                    bos.write(bytes, 0, len);
                    sum += len;
                    if (sum >= size) break;
                }

                bos.flush();//ˢ�»�����
                sum = 0;//��ʼ��������
            }

            //�ر���
            bis.close();
            bos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n��ɣ�");
    }
}
