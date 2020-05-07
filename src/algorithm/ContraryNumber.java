package algorithm;

import java.util.Scanner;

/*
网易2018校招编程题
为了得到一个数的"相反数",我们将这个数的数字顺序颠倒,然后再加上原先的数得到"相反数"。例如,为了得到1325的"相反数",首先我们将该数的数字顺序颠倒,我们得到5231,之后再加上
原先的数,我们得到5231+1325=6556.如果颠倒之后的数字有前缀零,前缀零将会被忽略。例如n = 100, 颠倒之后是1.
 */
public class ContraryNumber {
    public static void main(String[] args) {
        System.out.println("请输入整数数字：");
        Scanner input = new Scanner(System.in);
        /*
        在Java中输入字符串有两种方法，就是next()和nextLine().两者的区别就是：nextLine()的输入是碰到回车就终止输入，而next()方法是碰到空格，回车，Tab键都会被视为
        终止符。所以next()不会得到带空格的字符串，而nextLine()可以得到带空格的字符串。
         */
        String s = input.next();
        int number1 = Integer.parseInt(s);
        //将字符串倒序后转换成数字
        //因为Integer.parseInt()的参数类型必须是字符串所以必须加上toString()
        int number2 = Integer.parseInt(new StringBuilder(s).reverse().toString());
        System.out.println(number1 + number2);
        //new一个StringBuffer对象，与new一个StringBuilder对象效果相同
        int number3 = Integer.parseInt(new StringBuffer(s).reverse().toString());
        System.out.println(number1 + number3);
    }
}
