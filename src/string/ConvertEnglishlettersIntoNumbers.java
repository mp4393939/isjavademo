package string;

//前六个英文字母转换成数字
public class ConvertEnglishlettersIntoNumbers {
    public static void main(String[] args) {
        String str = "abcdef";
        getIndex(str);
    }

    public static void getIndex(String str) {
        byte[] bytes = str.getBytes();
        System.out.print("转换后:");
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            System.out.print(b - 96);
        }
    }
}