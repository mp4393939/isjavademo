package kinglian;

import string.StringChangInt;

public class test extends StringChangInt{
    public static void main(String[] args) {
        test t = new test();
        System.out.println("a + b=" + t.add(9, 34));
        StringChangInt a=new StringChangInt();
        a.parseInt("1122222");
        a.valueOf("789213");
        t.test(null);

    }
    public int add(int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            System.out.println("catchÓï¾ä¿é");
        } finally {
            System.out.println("finallyÓï¾ä¿é");
        }
        return 0;
    }
    void test(Integer a){
        //a=null;
        System.out.println(a);
    }
}
