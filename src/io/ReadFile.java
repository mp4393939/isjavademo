package io;

import java.io.File;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        //��ȡ�ļ�
        File file = new File("HashtableDemo1.yml");
        System.out.println("�ļ��Ƿ���ڣ�" + file.isFile());
        //����ļ������ڣ��������ļ�
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("���ļ������ɹ�");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (file.exists()) {
            System.out.println("�ļ��Ƿ���ڣ�" + file.isFile());
            System.out.println("�ļ�����" + file.getName());
            System.out.println("�ļ���С��" + file.length());
            System.out.println("���ش˳���·�������ַ�����ʽ��" + file.getPath());
            System.out.println("���ش˳���·������Ŀ¼�ĳ���·�����������·����û��ָ����Ŀ¼���򷵻�nul1��" + file.getParentFile());
            System.out.println("���ش˳���·�����ľ���·�����ַ�����" + file.getAbsolutePath());
        }
        ReadFile r = new ReadFile();
        System.out.println("a + b=" + r.add(9, 34));
    }

    public int add(int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            System.out.println("catch����");
        } finally {
            System.out.println("finally����");
        }
        return 0;
    }

}
