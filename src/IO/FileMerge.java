package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class FileMerge {

    public void merge() {

        Scanner input = new Scanner(System.in);
        System.out.println("\n����Ҫ�ϲ������ļ���  ���磺C:\\Users\\Administrator\\IdeaProjects\\isjavademo\\src\\io\\source.txt-(1).txt��");
        String src = input.nextLine();

        File file = new File(src);
        File files = new File(src);
        StringBuilder sb = null;

        if (!files.exists() || !file.isFile()) {
            System.out.println("�Ҳ�������ļ���");
            return;
        }

        //��ԭ�ļ���
        sb = new StringBuilder(src);
        int a = files.getAbsolutePath().length();
        sb.replace(a - 8, a + 1, "");
        files = new File(sb.toString());

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(files));

            byte[] bytes = new byte[1];
            int len = -1;
            int x = 1;
            int b = 1;//������ƫ����
            int c = 10;
            System.out.println("\n�ϲ��С�����������");

            do {
                System.out.println(file.getName());

                while ((len = bis.read(bytes)) != -1) {
                    bos.write(bytes, 0, len);
                }
                bos.flush();

                //����Ҫ�ϲ����ļ�
                x++;
                a = file.getAbsolutePath().lastIndexOf(")");
                sb = new StringBuilder(file.getAbsolutePath());
                if (x > c) {
                    b++;
                    c *= 10;
                }
                sb.replace(a - b, a, "" + x);    //�滻���
                file = new File(sb.toString());

                if (!file.exists()) break;
                bis = new BufferedInputStream(new FileInputStream(file));

            } while (true);

            bis.close();
            bos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n" + files);
        System.out.println("�ϲ���ɣ�");
    }
}
