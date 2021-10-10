package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class OutputDiskMethod {
    public static void main(String[] args) throws IOException {

        FileOutputStream file;
        PrintStream ps = null;
        FileOutputStream fos = new FileOutputStream(new File("FileOutputStream.txt"));
        //将文本内容清空
        fos.close();
        file = new FileOutputStream("FileOutputStream.txt", true);//如果第二个参数为true，则字节将写入文件的末尾而不是开头;false会清空原来的文本
        ps = new PrintStream(file);

        String newstr = new String("   a b c d e f g h  i          ,j");
        String[] des = newstr.split("\\s", 0);//如果输入limit数值等于0,则会执行切割无限次并且去掉该数组最后的所有空字符串
        System.out.println("切割后长度为：" + des.length);//切割后长度为：23
        for (int i = 0; i < des.length; i++) {
            System.out.print(des[i]);//abcdefghi,j
            ps.print(des[i]);
        }
        System.out.println();
        System.out.println("控制台打印内容已写入磁盘");

    }
}
