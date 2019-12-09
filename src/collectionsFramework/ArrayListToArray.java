package collectionsFramework;
/*
��ArrayList ��ȡ����
ʹ��ArrayListʱ����ʱ��ϣ����ȡ�����б����ݵ�ʵ�����顣���Ե���toArray0�����������һ�������÷�������Collection�ӿڶ���ġ�����ĳЩԭ��������ϣ��������ת�������飬���磺
��Ϊ�ض�������ȡ����Ĵ����ٶ�
��Ϊ�����������飬���ҷ���û�н��ռ��ϵ�������ʽ
�������ڼ��ϵĴ��뼯�ɵ���֧�ּ��ϵ�����������
������ʲôԭ�򣬽�ArrayListת�������鶼�Ǻ�ƽ�������顣
ǰ����͹���toArray()�����������汾��Ϊ�˱��ڷ����������ٴθ������ǣ�
object[] toArray()
<T> T[] toArray(T array[])
��һ���汾����Ԫ������ΪObject�����顣�ڶ����汾����Ԫ������ΪT�����顣ͨ�����ڶ����汾�����㣬��Ϊ�ܷ���ǡ�����͵����飬����ĳ�����ʾ������ʹ�ã�
*/

import java.util.*;

//Convert an ArrayList into an array
class ArrayListToArray {
    public static void main(String args[]) {
//Create an array list.
        ArrayList<Integer> al = new ArrayList<Integer>();
//Add elements to the array 1ist
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);

        System.out.println("Contents of al:" + al);
//Get the array.
        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);
        int sum = 0;
//Sum the array.
        for (int i : ia) sum += i;
        System.out.println("Sum is:" + sum);
    }
}