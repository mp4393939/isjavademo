package io;

import java.io.*;

public class IdCardOutputDisk {
    public static void main(String[] args) throws IOException {
        //读取字符流
        // FileReader fr = new FileReader("E:\\jmeter\\IdCard.txt");
        //写入字符流
        //FileWriter fw = new FileWriter("E:\\jmeter\\Birthday.txt");
/*
从字符输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取。可以指定缓冲区大小，或者可以使用默认大小。 默认值足够大，可用于大多数用途。
通常，由读取器做出的每个读取请求将引起对底层字符或字节流的相应读取请求。 因此，建议将BufferedReader包装在其read（）操作可能昂贵的读取器上，例如FileReaders和
InputStreamReaders
 */
        BufferedReader brfr = new BufferedReader(new FileReader("E:\\jmeter\\IdCard.txt"));
/*
将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效写入。可以指定缓冲区大小，或者可以接受默认大小。 默认值足够大，可用于大多数用途。
提供了一个newLine（）方法，它使用平台自己的系统属性line.separator定义的行分隔符概念。 并非所有平台都使用换行符（'\ n'）来终止行。 因此，调用此方法来终止每个输出行，
因此优选直接写入换行符。
一般来说，Writer将其输出立即发送到底层字符或字节流。 除非需要提示输出，否则建议将BufferedWriter包装在其write（）操作可能很昂贵的Writer上，例如FileWriters和
OutputStreamWriters。
 */
        BufferedWriter bwfw = new BufferedWriter(new FileWriter("E:\\jmeter\\Birthday.txt"));
        //一行一行写
        String txt;
        //readLine()方法读取的字符不为null时
        while ((txt = brfr.readLine()) != null) {
            //System.out.println(txt.substring(6,10)+","+txt.substring(10,12)+","+txt.substring(12,14));
            String Year = txt.substring(6, 10);
            String Month = txt.substring(10, 12);
            String Day = txt.substring(12, 14);
            String Birthday = Year + "," + Month + "," + Day;
            //写一个字符串
            bwfw.write(Birthday);
            //写一行行分隔符
            bwfw.newLine();
            //刷新流
            bwfw.flush();
        }
        //关闭流
        brfr.close();
        bwfw.close();
        System.out.println("从身份证号码读取的生日已写入磁盘");
    }
}
