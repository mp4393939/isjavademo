package IdCardGenerator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) throws IOException {

        try {
            //��ȡ�ı���������̨�����д���ı�
            Exam1.readFile("E:\\demo\\2.txt");
            Exam1.WriterFile("E:\\demo\\2.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void WriterFile(String file) throws IOException {
        FileWriter fw = new FileWriter(file);//�ַ��ļ������
        BufferedWriter bw = new BufferedWriter(fw);    //�����ַ������
        bw.write("java ������ƣ�1111");//д���ַ�
        bw.newLine();//����
        bw.write("�ú�ѧϰ�������ϣ�");
        bw.newLine();
        bw.close();
        fw.close();
    }

    public static void readFile(String file) throws IOException {
        FileReader fr = new FileReader(file);//�ַ��ļ�������
        BufferedReader bw = new BufferedReader(fr);//�����ַ�������
        String content = "", line;//���������ַ���
        while ((line = bw.readLine()) != null) {
            content += line + "\n";
        }
        System.out.println(content);
        bw.close();
    }
}
