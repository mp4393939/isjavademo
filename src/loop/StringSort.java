package loop;

//字符串的冒泡排序
public class StringSort {
    //static String arr[] = {"Now", "I'm", "full", "tonight"};
    static String arr[] = {"zzz", "BB", "bb", "Bb","Null","bDD","String"};

    public static void main(String[] args) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
            //先输出首字母大写的字符串，再输出首字母小写的字符串
            System.out.println("区分大小写的输出:" + arr[j]);
        }
        for (int l = 0; l < arr.length; l++) {
            for (int k = l + 1; k < arr.length; k++) {
                if (arr[k].compareToIgnoreCase(arr[l]) < 0) {
                    String t = arr[l];
                    arr[l] = arr[k];
                    arr[k] = t;
                }
            }
            //字符串不区分首字母大小写，按照英文字母升序输出
            System.out.println("不区分大小写的输出:" + arr[l]);

        }
    }
}