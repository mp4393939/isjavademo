package string;

//��һ�������ַ���ת���ɶ��ŷָ���ַ���
public class StringSeparate {
    public static void main(String[] args) {
        new StringSeparate().Separate(132630264);
        new StringSeparate().Separate2(132630264);
        System.out.println("��ӡString���͵ķ������return��������ݴ�ӡ������");
        System.out.println(new StringSeparate().Separate2(132630264));

    }

    public String Separate(int oldstr) {
        String str = Integer.toString(oldstr);
        int temp = oldstr;
        //����һ�������洢�ַ���
        StringBuffer sb = new StringBuffer(str);
        for (int i = sb.length() - 3; i > 0; i = i - 3) {
            //�����ַ���
            sb.insert(i, ',');
        }
        System.out.println(sb);
        return null;
    }

    public String Separate2(int oldstr) {
        System.out.println(String.format("%,d", oldstr));
        return null;
    }
}
