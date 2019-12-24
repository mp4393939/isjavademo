package string;

//��ָ����������ַ���
public class SpecifyEncoding {
    public static void main(String[] args) {
        SpecifyEncoding se = new SpecifyEncoding();
        System.out.println(se.translateUTF_8("�ο��ش�"));
        System.out.println(se.translateGBK("�ο��ش�"));
    }

    public String translateUTF_8(String str) {
        String tempStr = "";
        try {
            tempStr = new String(str.getBytes("UTF-8"));
            tempStr = tempStr.trim();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return tempStr;
    }

    public String translateGBK(String str) {
        String tempStr = "";
        try {
            tempStr = new String(str.getBytes("GBK"));
            tempStr = tempStr.trim();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return tempStr;
    }
}
