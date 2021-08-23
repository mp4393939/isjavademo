package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PhoneOutputDisk {
    public static void main(String[] args) throws IOException {
        /*
        文件输出流是用于将数据写入到输出流File或一个FileDescriptor 。 文件是否可用或可能被创建取决于底层平台。 特别是某些平台允许一次只能打开一个文件来写入一个
        FileOutputStream （或其他文件写入对象）。 在这种情况下，如果所涉及的文件已经打开，则此类中的构造函数将失败。
        FileOutputStream用于写入诸如图像数据的原始字节流。 对于写入字符流，请考虑使用FileWriter 。
         */
        FileOutputStream file;
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream(new File("phonenumber.txt"));
            //将文本内容清空
            fos.close();
            file = new FileOutputStream("phonenumber.txt", true);
            ps = new PrintStream(file);
            for (long i = 13600000000L; i <= 13600000099L; i++) {
                ps.println(i);
            }
            System.out.println("随机生成的手机号码已写入磁盘");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("系统找不到指定的路径");
        }
        if (ps != null) {
            ps.close();
        }

    }
}
