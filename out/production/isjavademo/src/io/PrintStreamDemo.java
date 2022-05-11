package io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) {
        //PrintStream为另一个输出流添加了功能，即能够方便地打印各种数据值的表示。
        PrintStreamDemo w = new PrintStreamDemo();
        System.out.println("唉...");
        System.out.println("@*!~_~");
        System.out.println("So easy");
    }

    private PrintStreamDemo() {
        try {
            PrintStream print = new PrintStream("E:\\jmeter\\PrintStreamDemo.txt");  //写好输出位置文件；
            System.setOut(print);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}