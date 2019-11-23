package Time;

public class userlocaltime extends localtime {

    public static void main(String[] args) {
        userlocaltime text = new userlocaltime();
        text.gettime(10);
        text.localtime("localtime");
        //override
        text.gettime_0(false);
        //overwrite
        text.super1(10, 15, 20);
    }

    private void gettime(int a) {
        System.out.println(a * a * a);
    }

    private void gettime_0(boolean b) {
        System.out.println("------------override---------------");
        System.out.println(b);
    }

    private void super1(int i, int j, int k) {
        System.out.println("------------overwrite---------------");
        super.super1(i, j);
        k = i * j;
    }
}