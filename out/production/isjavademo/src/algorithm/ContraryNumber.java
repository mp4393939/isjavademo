package algorithm;

import java.util.Scanner;

/*
����2018У�б����
Ϊ�˵õ�һ������"�෴��",���ǽ������������˳��ߵ�,Ȼ���ټ���ԭ�ȵ����õ�"�෴��"������,Ϊ�˵õ�1325��"�෴��",�������ǽ�����������˳��ߵ�,���ǵõ�5231,֮���ټ���
ԭ�ȵ���,���ǵõ�5231+1325=6556.����ߵ�֮���������ǰ׺��,ǰ׺�㽫�ᱻ���ԡ�����n = 100, �ߵ�֮����1.
 */
public class ContraryNumber {
    public static void main(String[] args) {
        System.out.println("�������������֣�");
        Scanner input = new Scanner(System.in);
        /*
        ��Java�������ַ��������ַ���������next()��nextLine().���ߵ�������ǣ�nextLine()�������������س�����ֹ���룬��next()�����������ո񣬻س���Tab�����ᱻ��Ϊ
        ��ֹ��������next()����õ����ո���ַ�������nextLine()���Եõ����ո���ַ�����
         */
        String s = input.next();
        int number1 = Integer.parseInt(s);
        //���ַ��������ת��������
        //��ΪInteger.parseInt()�Ĳ������ͱ������ַ������Ա������toString()
        int number2 = Integer.parseInt(new StringBuilder(s).reverse().toString());
        System.out.println(number1 + number2);
        //newһ��StringBuffer������newһ��StringBuilder����Ч����ͬ
        int number3 = Integer.parseInt(new StringBuffer(s).reverse().toString());
        System.out.println(number1 + number3);
    }
}
