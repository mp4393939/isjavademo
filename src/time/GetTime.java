package time;

public class GetTime {
    public static void main(String[] args) {
        final int N = 100000;

        //��ʾ��Ч�ķ���ƴ���ַ���
        long starTime = System.currentTimeMillis();
        String str = "*";
        for (int i = 0; i < N; i++) {
            str += "*";

        }
        long endTime = System.currentTimeMillis();
        System.out.println("+=��ʱ��" + (endTime - starTime) + "����");


        //ʹ��StringBuffer�����ַ���ƴ�ӣ��ԽӶ��ڴ�����޸ģ���Լ��ǰ��ģ�+=��1000��
        starTime = System.currentTimeMillis();
        StringBuffer str1 = new StringBuffer("*");
        for (int i = 0; i < N; i++) {
            str1.append("*");
            //ƴ�� ׷��
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer��append��ʱ��" + (endTime - starTime) + "����");

        //StringBuffer�ļ�ǿ�� StringBuilder java1.5�Ժ�StringBuilderЧ�ʴ�Լ��ǰ���StringBuffer��45��
        starTime = System.currentTimeMillis();
        StringBuilder str2 = new StringBuilder("*");
        for (int i = 0; i < N; i++) {

        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder��append��ʱ��" + (endTime - starTime) + "����");
    }

}
