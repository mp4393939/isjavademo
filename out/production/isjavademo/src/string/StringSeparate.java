package string;

//将一个数字字符串转换成逗号分割的字符串
public class StringSeparate {
    public static void main(String[] args) {
        new StringSeparate().Separate(132630264);
        new StringSeparate().Separate2(132630264);
        System.out.println("打印String类型的方法会把return里面的内容打印出来：");
        System.out.println(new StringSeparate().Separate2(132630264));

    }

    public String Separate(int oldstr) {
        String str = Integer.toString(oldstr);
        int temp = oldstr;
        //声明一个变量存储字符串
        StringBuffer sb = new StringBuffer(str);
        for (int i = sb.length() - 3; i > 0; i = i - 3) {
            //插入字符串
            sb.insert(i, ',');
        }
        System.out.println(sb);
        return null;
    }

    public String Separate2(int oldstr) {
        System.out.println(String.format("%,d", oldstr));
        return null;
    }
}
