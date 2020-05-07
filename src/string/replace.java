package string;

public class replace {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("This is a HashtableDemo1");
        //replace()替换startIndex和endIndex-1之间的字串
        s.replace(5, 7, "was");
        System.out.println(s);
    }
}
