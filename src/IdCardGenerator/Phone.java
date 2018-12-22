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
            FileOutputStream f = new FileOutputStream(new File("E:\\jmeter\\phonenumber.txt"));//将文本内容清空
            f.close();
            file = new FileOutputStream("E:\\jmeter\\phonenumber.txt", true);//true?
            p = new PrintStream(file);
            p = new PrintStream(file);
            for (long i = 13600000000l; i <= 13600000099l; i++) {
                p.println(i);
            }
            System.out.println("随机生成的手机号码已写入文本");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("系统找不到指定的路径");
        }
        if (p != null) {
            p.close();
        }

    }
}
