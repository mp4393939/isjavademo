package string;

public class UseTrim {
    public static void main(String args[]) {
        String str1 = "This is String not null";
        String str2 = "        This is String not null    ";
        System.out.println(str1);
        System.out.println(str2.trim());
        System.out.print("�Ƚ�ԭʼ���ַ���str1�ͽ�ȡ����ַ���str2�Ƿ���ȣ�");
        System.out.print(str1 == str2.trim());//false
        //trim()����ʵ�����ǽ�ȡ�м�ķǿհ��ַ�
        String str3 = "        This is String              not null    ";
        System.out.println("\n" + str3.trim());
    }
}