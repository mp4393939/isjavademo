package string;

public class UseSplit {
/*
split ��������һ���ַ����ָ�Ϊ���ַ�����Ȼ�󽫽����Ϊ�ַ������鷵�ء�stringObj.split([separator]��[limit])
������stringObj ��ѡ�Ҫ���ֽ�� String ��������֡��ö��󲻻ᱻ split �����޸ġ�
separator ��ѡ��ַ����� ������ʽ ��������ʶ�˷ָ��ַ���ʱʹ�õ���һ�����Ƕ���ַ��������
�Ը�ѡ����ذ��������ַ����ĵ�һԪ�����顣 limit��ѡ���ֵ�������Ʒ��������е�Ԫ�ظ�����
˵����split �����Ľ����һ���ַ������飬�� stingObj ��ÿ������ separator ��λ�ö�Ҫ���зֽ⡣separator ����Ϊ�κ�����Ԫ�صĲ��ַ��ء�
split ��ʵ��ֱ�ӵ��õ� matcher ��� split �ķ������� . ����������ʽ��������ĺ��壬�������ʹ�õ�ʱ��������ת��"\\."
 */

    public static void main(String[] args) {
        String str = "�� ��  ��   ��            ";
        String re = str.replaceAll("[\\s]{2,}", " ");
        System.out.println(re);//�� �� �� ��

        String line = "good12 morning34  good56   night78";
        //��String����split֮�����������
        String[] tt = line.split("\\s+");
        for (String t : tt) {
            System.out.print(t + "\t");//good12  morning34  good56 night78δ�ı�
        }
        System.out.println();

        String originalString = new String("5,8,6,9,12,56,3");
        String[] destString = originalString.split(",");
        for (int i = 0; i < destString.length; i++)
            System.out.print(destString[i] + " ");//5 8 6 9 12 56 3
        System.out.println();

        String original = new String("abc,ef,bdj,983,r56,34u");
        String[] dest = original.split(",", 3);
        for (int i = 0; i < dest.length; i++)
            System.out.print(dest[i]);//abcefbdj,983,r56,34u
        System.out.println();

        String value2 = "ABCD|568|ER5|54P";
        String[] names2 = value2.split("\\|");
        for (int i = 0; i < names2.length; i++)
            System.out.print(names2[i]);//ABCD568ER554P
        System.out.println();

        String newstr = new String("   a b c d e f g h  i          ,j");
        String[] des = newstr.split("\\s", 0);//�������limit��ֵ����0,���ִ���и����޴β���ȥ���������������п��ַ���
        System.out.println("�и�󳤶�Ϊ��" + des.length);//�и�󳤶�Ϊ��23
        for (int i = 0; i < des.length; i++)
            System.out.print(des[i]);//abcdefghi,j
        System.out.println();
    }
}