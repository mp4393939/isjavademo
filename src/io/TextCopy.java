package io;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextCopy {
    /**
     首先创建读取字符数据流对象关联所要复制的文件。
     创建缓冲区对象关联流对象。
     从缓冲区中将字符创建并写入到要目的文件中。
     */
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\jmeter\\IdCard.txt");
        FileWriter fw = new FileWriter("E:\\jmeter\\IdCard_TextCopy.txt");
        BufferedReader bufr = new BufferedReader(fr);
        BufferedWriter bufw = new BufferedWriter(fw);
        //一行一行写
        String line;
        while((line = bufr.readLine()) != null){
            bufw.write(line);
            bufw.newLine();
            bufw.flush();
        }
	/*	一个字节一个字节写
	    int ch = 0;
		while((ch = bufr.read())!=-1){
			bufw.write(ch);
		}*/
        bufr.close();
        bufw.close();
    }
}
