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
        //���ı��������
        fos.close();
        file = new FileOutputStream("FileOutputStream.txt", true);//����ڶ�������Ϊtrue�����ֽڽ�д���ļ���ĩβ�����ǿ�ͷ;false�����ԭ�����ı�
        ps = new PrintStream(file);

        String newstr = new String("   a b c d e f g h  i          ,j");
        String[] des = newstr.split("\\s", 0);//�������limit��ֵ����0,���ִ���и����޴β���ȥ���������������п��ַ���
        System.out.println("�и�󳤶�Ϊ��" + des.length);//�и�󳤶�Ϊ��23
        for (int i = 0; i < des.length; i++) {
            System.out.print(des[i]);//abcdefghi,j
            ps.print(des[i]);
        }
        System.out.println();
        System.out.println("����̨��ӡ������д�����");

    }
}
