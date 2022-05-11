package reflect;

public class Entity {
    public void printWord() {
        System.out.println("Print a word.");
    }

    public void printWord(int i) {
        System.out.println("i=" + i);
    }

    public void useString(String s) {
        System.out.println("s=" + s);
    }

    public String returnString(String str) {
        System.out.println("str=" + str);
        return null;
    }
}
