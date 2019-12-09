package string;


public class StringChangInt {
    public static void main(String[] args) {
       /* StringChangInt sc=new StringChangInt();
        sc.parseInt("1122222");
        sc.valueOf("789213");*/
    }

    public void parseInt(String str) {
        String temp = str;
        try {
            //用parseInt()方法将String类型转化为int类型
            int a = Integer.parseInt(temp);
            System.out.println("将String类型转化为int类型：" + a);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            System.out.println("初始类型：" + str);
        }
    }

    public void valueOf(String str) {
        //string temp = str;
        try {
            //用valueOf()方法将String类型转化为int类型
            int a = Integer.valueOf(str).intValue();
            System.out.println("将String类型转化为int类型：" + a);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            System.out.println("初始类型：" + str);
        }
    }

}