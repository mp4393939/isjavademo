package IdCardGenerator;

public class boolean1 {
    public static void main(String args[]) {
        boolean i = true;
        boolean j;
        System.out.println("i is:" + i);
        i = false;
        System.out.println("i is:" + i);
        if (i)
            System.out.println("this is executed");
        i = false;
        System.out.println("this is not executed");
        j = true;
        System.out.println("i is:" + j);
        j = false;
        System.out.println("i is:" + j);
        if (j)
            System.out.println("this is executed");
        j = false;
        System.out.println("this is not executed");

    }
}
