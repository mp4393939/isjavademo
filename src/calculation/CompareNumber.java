package calculation;

public class CompareNumber {
    public static void main(String[] args) {
        int Old_FOrderState = 6;
        long New_FOrderState = 6l;
        boolean compare1 = (Old_FOrderState == New_FOrderState);
        System.out.println(compare1);

        byte i = 15;
        short j = 15;
        boolean compare2 = (i == j);
        System.out.println(compare2);

        float num1 = 114.80f;
        double num2 = 114.80;
        boolean compare3 = (num1 == num2);
        System.out.println(compare3);

    }

}
