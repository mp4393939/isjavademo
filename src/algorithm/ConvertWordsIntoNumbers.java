package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConvertWordsIntoNumbers {
    public static void main(String[] args) {
        String[] a = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Scanner input = new Scanner(System.in);
        System.out.println("��������Ϊzeroonetwothreefourfivesixseveneightnine,������Ӣ������,������֮���밴�س���:");
        String str = input.next();
        String c = str;//���������Ӣ������
        String cCopy = str;//���Ǹ��Ƶ������Ӣ������
        List<String> list = new ArrayList<String>();
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (cCopy.startsWith(a[j])) {
                    count++;
                    cCopy = cCopy.substring(a[j].length(), cCopy.length());
                    break;
                }
            }

        }

        //countΪc�ĸ���,��c�е������뵽list������ȥ;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < a.length; j++) {
                if (c.startsWith(a[j])) {
                    list.add(a[j]);
                    c = c.substring(a[j].length(), c.length());
                    break;
                }
            }
        }
        //list���ϵ���������a�����жϣ��ҳ��±�;
        System.out.print("�������Ӣ������Ϊ:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        System.out.print("Ӣ��ת��Ϊ����������Ϊ:");
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < a.length; j++) {
                if (list.get(i).equals(a[j])) {
                    System.out.print(j);
                }
            }
        }

    }
}