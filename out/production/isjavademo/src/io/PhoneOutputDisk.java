package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PhoneOutputDisk {
    public static void main(String[] args) throws IOException {
        /*
        �ļ�����������ڽ�����д�뵽�����File��һ��FileDescriptor �� �ļ��Ƿ���û���ܱ�����ȡ���ڵײ�ƽ̨�� �ر���ĳЩƽ̨����һ��ֻ�ܴ�һ���ļ���д��һ��
        FileOutputStream ���������ļ�д����󣩡� ����������£�������漰���ļ��Ѿ��򿪣�������еĹ��캯����ʧ�ܡ�
        FileOutputStream����д������ͼ�����ݵ�ԭʼ�ֽ����� ����д���ַ������뿼��ʹ��FileWriter ��
         */
        FileOutputStream file;
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream(new File("phonenumber.txt"));
            //���ı��������
            fos.close();
            file = new FileOutputStream("phonenumber.txt", true);
            ps = new PrintStream(file);
            for (long i = 13600000000L; i <= 13600000099L; i++) {
                ps.println(i);
            }
            System.out.println("������ɵ��ֻ�������д�����");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("ϵͳ�Ҳ���ָ����·��");
        }
        if (ps != null) {
            ps.close();
        }

    }
}
