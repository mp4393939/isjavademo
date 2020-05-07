package calculation;

/*
��������|�ֽڿռ�|ʹ�ó���
byte|1�ֽڣ�8λ��|�洢�ֽ����ݣ��ϳ��ã�
short |2�ֽڣ�16λ��|�����Կ��ǣ�����ʹ�ã�
int |4�ֽڣ�32λ��|�洢��ͨ���������ã�
long |8�ֽڣ�64λ��|�洢�����������ã�
float |4�ֽڣ�32λ���洢�������������ã�
double|8�ֽڣ�64λ���洢˫���ȸ����������ã�
char|2�ֽڣ�16λ��|�洢һ���ַ������ã�
boolean |1�ֽڣ�8λ��|�洢�߼�������true��false�������ã�

byte��short��int��long ��Χ��
-128 , 127
-32768 , 32767
-2147483648 , 2147483647
-9223372036854775808 , 9223372036854775807
float��double ���ȷ�Χ��
-126 , 127
-1022 , 1023
char �ɱ�ʾ�� Unicode ��Χ��
0 , ffff
boolean ��ֵ
true,false
 */
public class Range {
    public static void main(String[] args) {
        System.out.println("byte��short��int��long ��Χ��");
        System.out.printf("%d , %d%n",
                Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%d , %d%n",
                Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%d , %d%n",
                Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%d , %d%n",
                Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.println("float��double ���ȷ�Χ��");
        System.out.printf("%d , %d%n",
                Float.MIN_EXPONENT, Float.MAX_EXPONENT);
        System.out.printf("%d , %d%n",
                Double.MIN_EXPONENT, Double.MAX_EXPONENT);

        System.out.println("char �ɱ�ʾ�� Unicode ��Χ��");
        System.out.printf("%h , %h%n",
                Character.MIN_VALUE, Character.MAX_VALUE);
        System.out.println("boolean ��ֵ");
        System.out.printf("%b,%b%n",
                Boolean.TRUE, Boolean.FALSE);
    }
}
