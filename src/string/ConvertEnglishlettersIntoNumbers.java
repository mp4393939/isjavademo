package string;

//ǰ����Ӣ����ĸת��������
public class ConvertEnglishlettersIntoNumbers {
    public static void main(String[] args) {
        String str = "abcdef";
        getIndex(str);
    }

    public static void getIndex(String str) {
        byte[] bytes = str.getBytes();
        System.out.print("ת����:");
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            System.out.print(b - 96);
        }
    }
}