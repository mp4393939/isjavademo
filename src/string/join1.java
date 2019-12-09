package string;

public class join1 {
    public static void main(String[] args) {
        String result = String.join(" ", "One", "Two", "Three");
        System.out.println(result);
        String result2 = String.join("", "One", "Two", "Three");
        System.out.println(result2);
    }
}
