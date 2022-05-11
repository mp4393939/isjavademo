package calculation;

public class CompareCharacter {
    public static void main(String[] args) {
        char i = 'жа';
        char j = '\u4e2d';
        boolean compare1 = (i == j);
        System.out.println(compare1);

        String k = "";
        String h = null;
        boolean compare2 = (k == h);
        System.out.println(compare2);
    }
}
