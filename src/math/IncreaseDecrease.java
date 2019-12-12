package math;

/*
Java的自增运算符（++）和自减运算符（--）继承自C++，可以使变量的值加1或减1，但其写在变量前和变量后有不同的效果：
-如果写在变量前表示在使用这个变量之前加1或减1
-如果写在变量之后表示这个变量使用完之后再加1或减1
*/
public class IncreaseDecrease {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //先将a的值赋给c1，然后a再自加
        int c1 = a++;
        //先将b的值自加，然后再赋给c2
        int c2 = ++b;
        System.out.println("a:" + a);//11
        System.out.println("c1:" + c1);//10
        System.out.println("b:" + b);//21
        System.out.println("c2:" + c2);//21
        int i = 50;
        int j = 88;
        //先将i的值赋给k1，然后a再自减
        int k1 = i--;
        //先将j的值自减，然后再赋给k2
        int k2 = --j;
        System.out.println("i:" + i);//49
        System.out.println("k1:" + k1);//50
        System.out.println("j:" + j);//87
        System.out.println("k2:" + k2);//87
    }
}