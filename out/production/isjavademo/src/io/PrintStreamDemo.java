package io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) {
        //PrintStreamΪ��һ�����������˹��ܣ����ܹ�����ش�ӡ��������ֵ�ı�ʾ��
        PrintStreamDemo w = new PrintStreamDemo();
        System.out.println("��...");
        System.out.println("@*!~_~");
        System.out.println("So easy");
    }

    private PrintStreamDemo() {
        try {
            PrintStream print = new PrintStream("E:\\jmeter\\PrintStreamDemo.txt");  //д�����λ���ļ���
            System.setOut(print);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}