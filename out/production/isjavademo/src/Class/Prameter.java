package Class;

/*
��ν�İ�ֵ���ñ�ʾ�������յ��ǵ������ṩ��ֵ���������õ������ʾ�������յ��ǵ������ṩ�ı�����ַ��һ�����������޸Ĵ�����������Ӧ�ı���ֵ���������޸Ĵ���ֵ������
��Ӧ�ı���ֵ����仰�൱��Ҫ�����ǰ�ֵ���ã�call by value�������õ��ã�call by reference���ĸ�������
 */
public class Prameter {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        //��ֵ���ݵ��ù����У�ֻ�ܰ�ʵ�δ��ݸ��βΣ������ܰ��βε�ֵ�������õ�ʵ���ϡ��ں������ù����У��βε�ֵ�����ı䣬��ʵ�ε�ֵ���ᷢ���ı䡣
        System.out.println("a=" + a + ",b=" + b);
        //�������ô��ݵ��õĻ��� �У�ʵ�����ǽ�ʵ�����õĵ�ַ���ݸ����βΣ������κη������β��ϵĸı�Ҳ�ᷢ����ʵ�α����ϡ�
        swap(a, b);
    }

    private static void swap(Integer numa, Integer numb) {
        Integer tmp = numa;
        numa = numb;
        numb = tmp;
        System.out.println("numa=" + numa + ",numb=" + numb);
    }
}
