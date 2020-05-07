package calculation;

/*
因为每次<<左移相当于将原始值乘以2，所以程序员经常利用这个事实作为乘以2的高效替代方法。但是需要小心。如果将二进制1移进高阶位（第31位或第63位），结果会变为负数。
 */
public class OpBit {
    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 42;
        //完整书写：a =a|4
        // 按位或运算符“|”的运算规则为：只要两个操作数中有一个为1，结果就为1
        a |= 4;
        //完整书写：b =b>>1
        // 右移运算符“>>”可以将数值中的所有位向右移动指定的次数，它的一般形式为：value>>ContraryNumber
        b >>= 1;
        //完整书写：c =c<<1
        // 左移运算符“<<”可以将数值中的所有位向左移动指定的次数，它的一般形式为：value<<ContraryNumber
        c <<= 1;
        //完整书写：a=a^c
        // 按位异或运算符“^”的运算规则为：如果只有一个操作数为1，结果为1，否则结果为0
        a ^= c;
        //按位取反，也称为“位求补”（bitwise complement）。一元非运算符“~”可以反转操作数中的所有位
        d = ~d;
        System.out.println("a = " + a);//a = 3
        System.out.println("b = " + b);//b = 1，2>>1表示向右移动一位，2/2=1
        System.out.println("c = " + c);//c = 6，3<<1表示向左移动一位,3*2=6
        System.out.println("d = " + d);//d = -43
    }
}
