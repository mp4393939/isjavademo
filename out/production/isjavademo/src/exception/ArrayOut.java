package exception;

//数组越界异常
public class ArrayOut {

    public static void main(String[] args) {
        //数组的访问：通过下标从0开始
        int[] arr = new int[4];
        try {
            //给arr中的第1个数赋值为55
            arr[0] = 55;
            arr[1] = 66;
            arr[2] = 77;
            arr[3] = 88;
            //错误，数组越界
            arr[4] = 99;
        } catch (ArrayIndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println("此处出现异常：数组越界");
        } finally {
            System.out.println("自定义异常");
        }

    }

}
