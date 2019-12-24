package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class indexOf_Str {
    public static void main(String[] args) throws IOException {
        //读取一个文本的字符流,str="ABCDEFGHIJKLMN"
        BufferedReader in = new BufferedReader(new FileReader("E:\\jmeter\\Orders.txt"));
        String txt = null;
        int line = 1;
        //定义一个空字符串来接受读到的字符串
        String str = "";
//循环把读取到的字符赋给str
        while ((txt = in.readLine()) != null) {
            str += txt;
        }
        System.out.println("str=" + str);
//判断str中是否有EFG子串，为true则说明有,进去if语句
        if (str.contains("LMN")) {
            System.out.println("yes");
//取得子串的初始位置
            int i = str.indexOf("LMN");
//根据的要取的内容后多少字符+多少个
            String strLMN = str.substring(i, i + 3);
            System.out.println(strLMN);
        }
    }
}
