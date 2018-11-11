package IdCardGenerator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) throws IOException {

        try {
            //读取文本，将控制台的输出写入文本
            Exam1.readFile("E:\\demo\\2.txt");
            Exam1.WriterFile("E:\\demo\\2.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void WriterFile(String file) throws IOException {
        FileWriter fw = new FileWriter(file);//字符文件输出流
        BufferedWriter bw = new BufferedWriter(fw);    //缓冲字符输出流
        bw.write("java 程序设计！1111");//写入字符
        bw.newLine();//换行
        bw.write("好好学习天天向上！");
        bw.newLine();
        bw.close();
        fw.close();
    }

    public static void readFile(String file) throws IOException {
        FileReader fr = new FileReader(file);//字符文件输入流
        BufferedReader bw = new BufferedReader(fr);//缓冲字符输入流
        String content = "", line;//定义两个字符串
        while ((line = bw.readLine()) != null) {
            content += line + "\n";
        }
        System.out.println(content);
        bw.close();
    }
}
