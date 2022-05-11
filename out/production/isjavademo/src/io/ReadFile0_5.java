package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ReadFile0_5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String s = null;
        //读取绝对路径的文本，注意使用“\\”
        File f1 = new File("E:\\jmeter\\Orders.txt");//员工信息中要有员工数据
        File f2 = new File("E:\\jmeter\\Orders.txt");

        try {
            // 读取“员工信息.txt”文件
            FileReader fileReader = new FileReader(f1);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((s = bufferedReader.readLine()) != null) {
                list.add(s);
            }
            System.out.println(list);// 打印list中读到的数据

            // 写入“员工姓名.txt”文件
            FileWriter fileWriter = new FileWriter(f2);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                if (i == 2) {
                    bufferedWriter.write(list.get(i), 0, 0);// 截取前5个字符
                    bufferedWriter.newLine();
                }
            }

            // 关闭流
            bufferedReader.close();
            fileReader.close();
            bufferedWriter.close();
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
