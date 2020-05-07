package string;

public class IntChangString {
    public static void main(String[] args) {
        IntChangString sc = new IntChangString();
        sc.add(123);
        sc.valueOf(123);
        sc.toString(123);
    }

    void add(int i) {
        String str = i + "";
        System.out.println(str);
    }

    void valueOf(int i) {
        String str = String.valueOf(i);
        System.out.println(str);
    }

    void toString(int i) {
        String str = Integer.toString(i);
        System.out.println(str);
    }
}
