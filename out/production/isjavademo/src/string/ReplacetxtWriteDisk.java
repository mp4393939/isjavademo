package string;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplacetxtWriteDisk {
    public static void main(String[] args) throws IOException {
        BufferedReader brfr = new BufferedReader(new FileReader("E:\\lib\\驸马难当gl.txt"));
        BufferedWriter bwfw = new BufferedWriter(new FileWriter("E:\\lib\\gl - 副本.txt"));
        //一行一行写
        String txt;
        //readLine()方法读取的字符不为null时
        while ((txt = brfr.readLine()) != null) {
            //String Year = txt.substring(6, 10);
            //String Month = txt.substring(10, 12);
            //String Day = txt.substring(12, 14);
            //String Birthday = Year + "," + Month + "," + Day;
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 1; i <= 175; i++) {
                list.add(i);
                //偶数
           /* if(i%2==0){

            }*/
            }
            Integer[] ouShu = new Integer[list.size()];
            ouShu = list.toArray(ouShu);
            for (int i : ouShu) {
                new MyFileUtils().modifyFileContent("E:\\lib\\驸马难当gl.txt", Integer.toString(i), "第" + new ArabicnumChangeChinesenum().isArabicnumChangeChinesenum(list.get(i - 1)) + "章");
                //new MyFileUtils().modifyFileContent("E:\\lib\\驸马难当gl.txt",Integer.toString(i),new ArabicnumChangeChinesenum().isArabicnumChangeChinesenum(list.get(i - 1)));
                //读完之后读取下一个
                //写一个字符串
                bwfw.write(txt);
                //写一行行分隔符
                bwfw.newLine();
                //刷新流
                bwfw.flush();
                /*if (Integer.toString(list.get(i-1)).equals(txt) == true) {
                    String re = txt.replaceFirst(Integer.toString(i), new ArabicnumChangeChinesenum().isArabicnumChangeChinesenum(list.get(i - 1)));
                    //读完之后读取下一个
                    //写一个字符串
                    bwfw.write(re);
                    //写一行行分隔符
                    bwfw.newLine();
                    //刷新流
                    bwfw.flush();
                }*/
            }


        }
        System.out.println("ok");

    }


    //System.out.println(list.get(0));
    //System.out.println(new ArabicnumChangeChinesenum().NumChangechineseNum(list.get(0)));
}


