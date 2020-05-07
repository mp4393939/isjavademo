package Class;

/*
所谓的按值调用表示方法接收的是调用着提供的值，而按引用调用则表示方法接收的是调用者提供的变量地址。一个方法可以修改传递引用所对应的变量值，而不能修改传递值调用所
对应的变量值，这句话相当重要，这是按值调用（call by value）与引用调用（call by reference）的根本区别
 */
public class Prameter {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        //在值传递调用过程中，只能把实参传递给形参，而不能把形参的值反向作用到实参上。在函数调用过程中，形参的值发生改变，而实参的值不会发生改变。
        System.out.println("a=" + a + ",b=" + b);
        //而在引用传递调用的机制 中，实际上是将实参引用的地址传递给了形参，所以任何发生在形参上的改变也会发生在实参变量上。
        swap(a, b);
    }

    private static void swap(Integer numa, Integer numb) {
        Integer tmp = numa;
        numa = numb;
        numb = tmp;
        System.out.println("numa=" + numa + ",numb=" + numb);
    }
}
