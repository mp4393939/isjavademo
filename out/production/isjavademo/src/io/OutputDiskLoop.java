package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class OutputDiskLoop {
    public static void main(String[] args) throws IOException {
        FileOutputStream file;
        PrintStream ps = null;
        file = new FileOutputStream("FileOutputStream.docx", false);//����ڶ�������Ϊtrue�����ֽڽ�д���ļ���ĩβ�����ǿ�ͷ;false�����ԭ�����ı�
        ps = new PrintStream(file);
        StringBuilder sb=new StringBuilder();

        System.out.println(sb);
        for (int i = 1; i <=100000; i++) {
            sb.append("һҹ������");
        }
        ps.print(sb);
        System.out.println(sb.length());
        System.out.println("����̨��ӡ������д�����");

    }
}
