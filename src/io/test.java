package io;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        //��ȡһ���ı����ַ���,str="ABCDEFGHIJKLMN"
        BufferedReader in = new BufferedReader(new FileReader("src/IdCardGenerator/ABCDEFGHIJKLMN.txt"));
        String txt = null;
        int line = 1;
        //����һ�����ַ��������ܶ������ַ���
        String str = "";
//ѭ���Ѷ�ȡ�����ַ�����str
        while ((txt = in.readLine()) != null) {
            str += txt;
            line++;
            System.out.println("line" + line + ":" + txt);
        }
//�ж�str���Ƿ���EFG�Ӵ���Ϊtrue��˵���С���ȥif���
        if (str.contains("BCD")) {
            System.out.println("yes");
//ȡ���Ӵ��ĳ�ʼλ��
            int i = str.indexOf("BCD");
//���ݵ�Ҫȡ�����ݺ�����ַ�+���ٸ�
            String strRead = str.substring(i, i + 3);
            System.out.println(strRead);
        }
    }
}