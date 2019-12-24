package io;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("E:\\jmeter\\IdCard.txt");
//		fw.write("ok168");
//		fw.close();
        /**
         * 为了提高写入的效率，使用了字符流的缓冲区。
         * 创建了一个字符写入流的缓冲区对象，并和指定要被缓冲的流对象相关联。
         */
        BufferedWriter bufw = new BufferedWriter(fw);

        //使用缓冲区中的方法将数据写入到缓冲区中。
        bufw.write("hello world !");
        bufw.newLine();
        bufw.newLine();
        bufw.write("!hello world !");
        bufw.write("!hello world !");
        //使用缓冲区中的方法，将数据刷新到目的地文件中去。
        bufw.flush();
        //关闭缓冲区,同时关闭了fw流对象
        bufw.close();
    }
}
