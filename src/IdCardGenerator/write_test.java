package IdCardGenerator;

import java.io.*;

public class write_test {
    public static void main(String[] args) throws IOException {

        File f = new File("out.txt");
        f.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(f);
        PrintStream printStream = new PrintStream(fileOutputStream);
        System.setOut(printStream);
        System.out.println("Ĭ�����������̨����һ�䣬��������ļ� out.txt");
    }
}
