package io;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextCopy {
    /**
     ���ȴ�����ȡ�ַ����������������Ҫ���Ƶ��ļ���
     �����������������������
     �ӻ������н��ַ�������д�뵽ҪĿ���ļ��С�
     */
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\jmeter\\IdCard.txt");
        FileWriter fw = new FileWriter("E:\\jmeter\\IdCard_TextCopy.txt");
        BufferedReader bufr = new BufferedReader(fr);
        BufferedWriter bufw = new BufferedWriter(fw);
        //һ��һ��д
        String line;
        while((line = bufr.readLine()) != null){
            bufw.write(line);
            bufw.newLine();
            bufw.flush();
        }
	/*	һ���ֽ�һ���ֽ�д
	    int ch = 0;
		while((ch = bufr.read())!=-1){
			bufw.write(ch);
		}*/
        bufr.close();
        bufw.close();
    }
}
