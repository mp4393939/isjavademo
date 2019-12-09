package string;

public class IntChangString {
    public static void main(String[] args) {
        IntChangString sc=new IntChangString();
        sc.add(1);
        sc.valueOf(232323);
        sc.toString(665);
    }
    void add(int i){
        String str=i+"";
        System.out.println(str);
    }
    void valueOf(int i){
        String str = String.valueOf(i);
        System.out.println(str);
    }
    void toString(int i){
        String str = Integer.toString(i);
        System.out.println(str);
    }
}
