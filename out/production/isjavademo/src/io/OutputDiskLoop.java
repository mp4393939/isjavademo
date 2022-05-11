package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class OutputDiskLoop {
    public static void main(String[] args) throws IOException {
        FileOutputStream file;
        PrintStream ps = null;
        file = new FileOutputStream("FileOutputStream.docx", false);//如果第二个参数为true，则字节将写入文件的末尾而不是开头;false会清空原来的文本
        ps = new PrintStream(file);
        StringBuilder sb=new StringBuilder();

        System.out.println(sb);
        for (int i = 1; i <=100000; i++) {
            sb.append("一夜暴富。");
        }
        ps.print(sb);
        System.out.println(sb.length());
        System.out.println("控制台打印内容已写入磁盘");

    }
}
