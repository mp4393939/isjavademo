package string;

//冒泡排序
public class compareTo {
    static String arr[] = {"Now", "I'm", "full", "tonight"};

    public static void main(String[] args) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
            System.out.println("区分大小写的输出:" + arr[j]);
        }
        for (int j = 0; j < arr.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr[i].compareToIgnoreCase(arr[j]) < 0) {
                    String t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
            System.out.println("不区分大小写的输出:" + arr[j]);
        }

    }
}
