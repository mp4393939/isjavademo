package loop;

//�ַ�����ð������
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
            //���������ĸ��д���ַ��������������ĸСд���ַ���
            System.out.println("���ִ�Сд�����:" + arr[j]);
        }
        for (int l = 0; l < arr.length; l++) {
            for (int k = l + 1; k < arr.length; k++) {
                if (arr[k].compareToIgnoreCase(arr[l]) < 0) {
                    String t = arr[l];
                    arr[l] = arr[k];
                    arr[k] = t;
                }
            }
            //�ַ�������������ĸ��Сд������Ӣ����ĸ�������
            System.out.println("�����ִ�Сд�����:" + arr[l]);

        }
    }
}