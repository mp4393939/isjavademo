package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

//��ȡ�ַ���������
public class ReadByte {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("������·��");
        String input = sc.next();
        int charNum = 0;
        int lineNum = 0;
        InputStreamReader isr = new InputStreamReader(new FileInputStream(input));
        BufferedReader br = new BufferedReader(isr);
        while (br.read() != -1) {
            String s = br.readLine();
            charNum += s.length();

            lineNum++;
        }
        isr.close();
        System.out.println("�ַ���:" + charNum + "�� ��:" + lineNum);
    }
}




