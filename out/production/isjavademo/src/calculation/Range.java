package calculation;

/*
类型名称|字节空间|使用场景
byte|1字节（8位）|存储字节数据（较常用）
short |2字节（16位）|兼容性考虑（很少使用）
int |4字节（32位）|存储普通整数（常用）
long |8字节（64位）|存储长整数（常用）
float |4字节（32位）存储浮点数（不常用）
double|8字节（64位）存储双精度浮点数（常用）
char|2字节（16位）|存储一个字符（常用）
boolean |1字节（8位）|存储逻辑变量（true、false）（常用）

byte、short、int、long 范围：
-128 , 127
-32768 , 32767
-2147483648 , 2147483647
-9223372036854775808 , 9223372036854775807
float、double 精度范围：
-126 , 127
-1022 , 1023
char 可表示的 Unicode 范围：
0 , ffff
boolean 的值
true,false
 */
public class Range {
    public static void main(String[] args) {
        System.out.println("byte、short、int、long 范围：");
        System.out.printf("%d , %d%n",
                Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%d , %d%n",
                Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%d , %d%n",
                Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%d , %d%n",
                Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.println("float、double 精度范围：");
        System.out.printf("%d , %d%n",
                Float.MIN_EXPONENT, Float.MAX_EXPONENT);
        System.out.printf("%d , %d%n",
                Double.MIN_EXPONENT, Double.MAX_EXPONENT);

        System.out.println("char 可表示的 Unicode 范围：");
        System.out.printf("%h , %h%n",
                Character.MIN_VALUE, Character.MAX_VALUE);
        System.out.println("boolean 的值");
        System.out.printf("%b,%b%n",
                Boolean.TRUE, Boolean.FALSE);
    }
}
