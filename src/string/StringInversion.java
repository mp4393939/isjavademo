package string;

//�ܽ�һ�� Java ���Գ�������⣺�� 'abc123' �ַ�����ת���������뵽�ķ�����д����
public class StringInversion {
    public static void main(String[] args) {
        String s = "abc123";
        System.out.println("�任ǰ: " + s);
        System.out.print("������charAt(i)���任��: ");
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.print("\n");
        System.out.println("����StringBuffer��StringBuilder��reverse��Ա�����任��: " + reverse1(s));
        System.out.println("����String��toCharArray�����Ƚ��ַ���ת��Ϊchar�������飬Ȼ�󽫸����ַ���������ƴ�ӱ任��: " + reverse2(s));
        System.out.println("����String��CharAt����ȡ���ַ����еĸ����ַ��任��: " + reverse3(s));
    }

    //����StringBuffer��StringBuilder��reverse��Ա����
    public static String reverse1(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    //����String��toCharArray�����Ƚ��ַ���ת��Ϊchar�������飬Ȼ�󽫸����ַ���������ƴ��
    public static String reverse2(String str) {
        char[] chars = str.toCharArray();
        String reverse = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            reverse += chars[i];
        }
        return reverse;
    }

    //����String��CharAt����ȡ���ַ����еĸ����ַ�
    public static String reverse3(String str) {
        String reverse = "";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            reverse = str.charAt(i) + reverse;
        }
        return reverse;
    }
}
