package IdCardGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Phone {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = null;
        PrintStream p = null;
        try {
            FileOutputStream f = new FileOutputStream(new File("E:\\jmeter\\phonenumber.txt"));//���ı��������
            f.close();
            file = new FileOutputStream("E:\\jmeter\\phonenumber.txt", true);//true?
            p = new PrintStream(file);
            p = new PrintStream(file);
            for (long i = 13600000000l; i <= 13600000099l; i++) {
                p.println(i);
            }
            System.out.println("������ɵ��ֻ�������д���ı�");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("ϵͳ�Ҳ���ָ����·��");
        }
        if (p != null) {
            p.close();
        }

    }
}
