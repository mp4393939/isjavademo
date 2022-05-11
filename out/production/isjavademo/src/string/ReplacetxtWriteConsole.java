package string;

import java.util.ArrayList;
import java.util.List;

public class ReplacetxtWriteConsole {
    public static void main(String[] args) {
        String str = "   “姐姐要休息了，出去再跟你说。”司徒灵儿媚眼轻白了欧阳天娇一记，转身轻扭动着柳腰莲步便走出了房门。\n" +
                "\n" +
                "\n" +
                "------------\n" +
                "\n" +
                "174 梦局二 不真实的结局\n" +
                "\n" +
                "\n" +
                "------------\n" +
                "\n" +
                "175 前尘忆梦~完结";
        List<Integer> list = new ArrayList<Integer>();
        list.add(174);
        list.add(175);
        /*for(int i=1;i<=175;i++){
            list.add(i);
        }*/
        Integer[] ig = new Integer[list.size()];
        ig = list.toArray(ig);
        int a = ig[0];
        String rp = str.replaceAll(Integer.toString(list.get(0)), new ArabicnumChangeChinesenum().isArabicnumChangeChinesenum(list.get(0)));
        rp = rp.replaceAll(Integer.toString(list.get(1)), new ArabicnumChangeChinesenum().isArabicnumChangeChinesenum(list.get(1)));
        //System.out.println(rp);
        new MyFileUtils().modifyFileContent("E:\\lib\\MyFileUtils.txt", "MyFileUtils", "@123");
    }
}
