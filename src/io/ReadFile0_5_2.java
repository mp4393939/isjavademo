package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFile0_5_2 {
    public static void main(String[] args) {
        //与本地文件建立了通信
        File file = new File("E:\\jmeter\\Orders.txt");
        BufferedReader reader = null;
        String txt = null;
        int line = 1;
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((txt = reader.readLine()) != null) {
                //逐行输出文本
                System.out.println("line" + line + ":" + txt);
                line++;
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
