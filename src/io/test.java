package io;

import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        //读取一个文本的字符流,str="ABCDEFGHIJKLMN"
        BufferedReader in = new BufferedReader(new FileReader("src/IdCardGenerator/ABCDEFGHIJKLMN.txt"));
        String txt = null;
        int line = 1;
        //定义一个空字符串来接受读到的字符串
        String str = "";
//循环把读取到的字符赋给str
        while ((txt = in.readLine()) != null) {
            str += txt;
            line++;
            System.out.println("line" + line + ":" + txt);
        }
//判断str中是否有EFG子串，为true则说明有。进去if语句
        if (str.contains("BCD")) {
            System.out.println("yes");
//取得子串的初始位置
            int i = str.indexOf("BCD");
//根据的要取的内容后多少字符+多少个
            String strRead = str.substring(i, i + 3);
            System.out.println(strRead);
        }
    }
}