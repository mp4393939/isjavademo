package String;

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
        for (int j1 = 0; j1 < arr.length; j1++) {
            for (int i1 = j1 + 1; i1 < arr.length; i1++) {
                if (arr[i1].compareToIgnoreCase(arr[j1]) < 0) {
                    String t = arr[j1];
                    arr[j1] = arr[i1];
                    arr[i1] = t;
                }
            }
            System.out.println("不区分大小写的输出:" + arr[j1]);
        }

    }
}
