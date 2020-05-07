package string;

import java.util.ArrayList;
import java.util.List;

//从字符串中提取数字
public class StringgetNum {
    public static void main(String[] args) {
        String str = "love23next234csdn3423javaeye";
        List<String> ss = new ArrayList<String>();
        for (String sss : str.replaceAll("[^0-9]", ",").split(",")) {
            if (sss.length() > 0) {
                ss.add(sss);
            }
        }
        System.out.print(ss);


    }


}


