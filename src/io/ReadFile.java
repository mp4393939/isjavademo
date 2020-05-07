package io;

import java.io.File;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        //读取文件
        File file = new File("HashtableDemo1.yml");
        System.out.println("文件是否存在：" + file.isFile());
        //如果文件不存在，创建新文件
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("新文件创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (file.exists()) {
            System.out.println("文件是否存在：" + file.isFile());
            System.out.println("文件名：" + file.getName());
            System.out.println("文件大小：" + file.length());
            System.out.println("返回此抽象路径名的字符串形式：" + file.getPath());
            System.out.println("返回此抽象路径名父目录的抽象路径名；如果此路径名没有指定父目录，则返回nul1：" + file.getParentFile());
            System.out.println("返回此抽象路径名的绝对路径名字符串：" + file.getAbsolutePath());
        }
        ReadFile r = new ReadFile();
        System.out.println("a + b=" + r.add(9, 34));
    }

    public int add(int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            System.out.println("catch语句块");
        } finally {
            System.out.println("finally语句块");
        }
        return 0;
    }

}
