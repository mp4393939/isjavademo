package io;

import java.io.*;

public class IdCardOutputConsole {
    public static void main(String[] args) {
        File file = new File("E:\\jmeter\\IdCard.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String txt;
        try {
            System.out.println("将身份证的生日取出，如下：");
            assert reader != null;
            while ((txt = reader.readLine()) != null) {
                System.out.println(txt.substring(6, 10) + "," + txt.substring(10, 12) + "," + txt.substring(12, 14));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
