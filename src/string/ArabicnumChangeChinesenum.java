package string;

public class ArabicnumChangeChinesenum {
    public static void main(String[] args) {
        System.out.println(new ArabicnumChangeChinesenum().isArabicnumChangeChinesenum(01));
    }

    public String isArabicnumChangeChinesenum(int src) {
        final String num[] = {"��", "һ", "��", "��", "��", "��", "��", "��", "��", "��"};
        final String unit[] = {"", "ʮ", "��", "ǧ", "��", "ʮ", "��", "ǧ", "��", "ʮ", "��", "ǧ"};
        String dst = "";
        int count = 0;
        while (src > 0) {
            dst = (num[src % 10] + unit[count]) + dst;
            src = src / 10;
            count++;
        }
        return dst.replaceAll("��[ǧ��ʮ]", "��").replaceAll("��+��", "��")
                .replaceAll("��+��", "��").replaceAll("����", "����")
                .replaceAll("��+", "��").replaceAll("��$", "");
    }
}
