package io;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\jmeter\\IdCard.txt");
//		fw.write("ok168");
//		fw.close();
        /**
         * Ϊ�����д���Ч�ʣ�ʹ�����ַ����Ļ�������
         * ������һ���ַ�д�����Ļ��������󣬲���ָ��Ҫ��������������������
         */
        BufferedWriter bufw = new BufferedWriter(fw);

        //ʹ�û������еķ���������д�뵽�������С�
        bufw.write("hello world !");
        bufw.newLine();
        bufw.newLine();
        bufw.write("!hello world !");
        bufw.write("!hello world !");
        //ʹ�û������еķ�����������ˢ�µ�Ŀ�ĵ��ļ���ȥ��
        bufw.flush();
        //�رջ�����,ͬʱ�ر���fw������
        bufw.close();
    }
}
