package IO;

import java.util.Scanner;

public class FileDivisionDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("要分割还是合并？    1、分割    2、合并");
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
