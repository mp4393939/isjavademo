package string;

import java.util.ArrayList;
import java.util.List;

public class ReplacetxtWriteConsole {
    public static void main(String[] args) {
        String str = "   �����Ҫ��Ϣ�ˣ���ȥ�ٸ���˵����˾ͽ������������ŷ���콿һ�ǣ�ת����Ť���������������߳��˷��š�\n" +
                "\n" +
                "\n" +
                "------------\n" +
                "\n" +
                "174 �ξֶ� ����ʵ�Ľ��\n" +
                "\n" +
                "\n" +
                "------------\n" +
                "\n" +
                "175 ǰ������~���";
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
