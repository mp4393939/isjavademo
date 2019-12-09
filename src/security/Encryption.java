package security;

import java.io.*;

public class Encryption {
    public static void main(String[] args) {
        Encryption enc = new Encryption();
        enc.encryption("今天10点出发".toCharArray());
    }

    private void encryption(char[] a) {
        int n;
        try {
            File out = new File("word.txt");
            for (int i = 0; i < a.length; i++) {
                a[i] = (char) (a[i] ^ 'R');
            }
            FileWriter fw = new FileWriter(out);
            fw.write(a, 0, a.length);
            fw.close();
            FileReader fr = new FileReader(out);
            char[] tom = new char[10];
            System.out.print("加密后：");
            while ((n = fr.read(tom, 0, 10)) != -1) {
                String s = new String(tom, 0, n);
                System.out.print(s);
            }
            fr.close();
            fr = new FileReader(out);
            System.out.println("\n" + "------------------------------------------------------------------------------");
            System.out.print("明文：");
            while ((n = fr.read(tom, 0, 10)) != -1) {
                for (int j = 0; j < n; j++) {
                    tom[j] = (char) (tom[j] ^ 'R');
                }
                String str = new String(tom, 0, n);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}