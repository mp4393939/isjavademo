package string;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplacetxtWriteDisk {
    public static void main(String[] args) throws IOException {
        BufferedReader brfr = new BufferedReader(new FileReader("E:\\lib\\�����ѵ�gl.txt"));
        BufferedWriter bwfw = new BufferedWriter(new FileWriter("E:\\lib\\gl - ����.txt"));
        //һ��һ��д
        String txt;
        //readLine()������ȡ���ַ���Ϊnullʱ
        while ((txt = brfr.readLine()) != null) {
            //String Year = txt.substring(6, 10);
            //String Month = txt.substring(10, 12);
            //String Day = txt.substring(12, 14);
            //String Birthday = Year + "," + Month + "," + Day;
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 1; i <= 175; i++) {
                list.add(i);
                //ż��
           /* if(i%2==0){

            }*/
            }
            Integer[] ouShu = new Integer[list.size()];
            ouShu = list.toArray(ouShu);
            for (int i : ouShu) {
                new MyFileUtils().modifyFileContent("E:\\lib\\�����ѵ�gl.txt", Integer.toString(i), "��" + new ArabicnumChangeChinesenum().isArabicnumChangeChinesenum(list.get(i - 1)) + "��");
                //new MyFileUtils().modifyFileContent("E:\\lib\\�����ѵ�gl.txt",Integer.toString(i),new ArabicnumChangeChinesenum().isArabicnumChangeChinesenum(list.get(i - 1)));
                //����֮���ȡ��һ��
                //дһ���ַ���
                bwfw.write(txt);
                //дһ���зָ���
                bwfw.newLine();
                //ˢ����
                bwfw.flush();
                /*if (Integer.toString(list.get(i-1)).equals(txt) == true) {
                    String re = txt.replaceFirst(Integer.toString(i), new ArabicnumChangeChinesenum().isArabicnumChangeChinesenum(list.get(i - 1)));
                    //����֮���ȡ��һ��
                    //дһ���ַ���
                    bwfw.write(re);
                    //дһ���зָ���
                    bwfw.newLine();
                    //ˢ����
                    bwfw.flush();
                }*/
            }


        }
        System.out.println("ok");

    }


    //System.out.println(list.get(0));
    //System.out.println(new ArabicnumChangeChinesenum().NumChangechineseNum(list.get(0)));
}


