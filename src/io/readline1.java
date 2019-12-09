package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class readline1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Reader类的子类InputStreamReader将字节转换为字符
        String[] str = new String[5];
        //程序最多读取5个字符或直到用户输入"stop"
        System.out.println("enter line of text");
        System.out.println("enter 'stop' to quit");
        for (int i = 0; i < 100; i++) {
        //超过5抛出java.lang.ArrayIndexOutOfBoundsException异常
            str[i] = br.readLine();
            if (str[i].equals("stop"))
                break;
        }
        System.out.println("\nHere is your input:");
        //display the lines
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop"))
                break;
            System.out.println(str[i]);
        }

    }
}
