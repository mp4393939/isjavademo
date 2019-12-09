package loop;

public class While_break {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < 10) {
            i = i + 1;
            System.out.println(i);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------------------");
        while (j <= 10) {
            j = j + 1;
            System.out.println(j);
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------------------");
        while (k <= 15) {
            k = k + 1;
            System.out.println(k);
            if (k == 5) {
                System.out.println("continue the loop");
                continue;
            }
            if (k == 9) {
                System.out.println("Stop the loop");
                break;
            }
        }
    }
}
