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
            //��parseInt()������String����ת��Ϊint����
            int a = Integer.parseInt(temp);
            System.out.println("��String����ת��Ϊint���ͣ�" + a);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            System.out.println("��ʼ���ͣ�" + str);
        }
    }

    public void valueOf(String str) {
        //string temp = str;
        try {
            //��valueOf()������String����ת��Ϊint����
            int a = Integer.valueOf(str).intValue();
            System.out.println("��String����ת��Ϊint���ͣ�" + a);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            System.out.println("��ʼ���ͣ�" + str);
        }
    }

}