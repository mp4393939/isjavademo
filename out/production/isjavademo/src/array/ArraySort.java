package array;

public class ArraySort {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 0, y = 0;
        System.out.println("从小到大排序：");
        for (int i = 0; i < array.length; i++) {
            x = i;
            System.out.print(array[i] + "\t");
        }
        System.out.println("\n" + "x=" + x);
        System.out.println("从大到小排序：");
        for (int j = array.length - 1; j >= 0; j--) {
            y = j;
            System.out.print(array[j] + "\t");
        }
        System.out.println("\n" + "y=" + y);
    }
}
