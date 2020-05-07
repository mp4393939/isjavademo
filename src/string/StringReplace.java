package string;

public class StringReplace {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------------");
        String a = "���� f_static_000 �� f_static_001 aaa f_static_001";
        //replaceAll()�滻���ַ��������ı�Ŀ��ƥ���ÿ�����ַ���
        a = a.replaceAll("f_static_\\d{3}", "#[face/png/$0]#");
        System.out.println(a);
        System.out.println("------------------------------------------------------------------------------");
        String b = "���� f_static_000 �� f_static_001 aaa f_static_001";
        //replaceFirst()�滻�ַ�����һ��ƥ�������������ʽ�����ַ���
        b = b.replaceFirst("f_static_\\d{3}", "#[face/png/$0]#");
        System.out.println(b);
        System.out.println("------------------------------------------------------------------------------");
        String c = "139 139��Թ���\n" +
                "\n" + "139" +
                "\uFEFF   +\"139\"+ ���,���µ��ڴ�Ҳ�׷��¹���̫�����÷����������������֮��139��";
        c = c.replaceFirst("139", "��139��");
        System.out.println(c);
        System.out.println("------------------------------------------------------------------------------");
        c = c.replaceAll("139", "��139��");
        System.out.println(c);
    }
}
