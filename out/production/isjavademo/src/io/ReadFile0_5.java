package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ReadFile0_5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String s = null;
        //��ȡ����·�����ı���ע��ʹ�á�\\��
        File f1 = new File("E:\\jmeter\\Orders.txt");//Ա����Ϣ��Ҫ��Ա������
        File f2 = new File("E:\\jmeter\\Orders.txt");

        try {
            // ��ȡ��Ա����Ϣ.txt���ļ�
            FileReader fileReader = new FileReader(f1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((s = bufferedReader.readLine()) != null) {
                list.add(s);
            }
            System.out.println(list);// ��ӡlist�ж���������

            // д�롰Ա������.txt���ļ�
            FileWriter fileWriter = new FileWriter(f2);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                if (i == 2) {
                    bufferedWriter.write(list.get(i), 0, 0);// ��ȡǰ5���ַ�
                    bufferedWriter.newLine();
                }
            }

            // �ر���
            bufferedReader.close();
            fileReader.close();
            bufferedWriter.close();
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
