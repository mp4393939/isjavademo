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
        System.out.println("\n输入要分割的文件：  （如：C:\\Users\\Administrator\\IdeaProjects\\isjavademo\\src\\io\\source.txt）");
        String src = input.nextLine();

        File file = new File(src);
        if (!file.exists() || !file.isFile()) {
            System.out.println("找不到这个文件！");
            return;
        }

        System.out.println("分割多大？  单位：byte");
        long size = input.nextLong();

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream bos = null;

            long sum = 0;//计数器
            long s = file.length();//文件的大小
            int part = 0;

            //计算把文件分割成几份
            if (s % size == 0) {
                part = (int) (s / size);
            } else {
                part = (int) (s / size) + 1;
            }

            byte[] bytes = new byte[1];
            int len = -1;
            System.out.println("\n正在分割······");

            for (int i = 0; i < part; i++) {
                System.out.println("第" + (i + 1) + "份...");
                bos = new BufferedOutputStream(new FileOutputStream(src + "-(" + (i + 1) + ").txt"));
                //bos = new BufferedOutputStream(new FileOutputStream(src+"_"+(i+1)+".txt"));

                //读取并输出文件
                while ((len = bis.read(bytes)) != -1) {
                    bos.write(bytes, 0, len);
                    sum += len;
                    if (sum >= size) break;
                }

                bos.flush();//刷新缓冲区
                sum = 0;//初始化计数器
            }

            //关闭流
            bis.close();
            bos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n完成！");
    }
}
