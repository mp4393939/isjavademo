package IO;

import java.util.Scanner;

public class FileDivisionDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ҫ�ָ�Ǻϲ���    1���ָ�    2���ϲ�");
        int s = input.nextInt();

        switch (s) {
            case 1:
                new FileDivision().division();
                break;
            case 2:
                new FileMerge().merge();
                break;
            default:
                return;
        }

    }

}
