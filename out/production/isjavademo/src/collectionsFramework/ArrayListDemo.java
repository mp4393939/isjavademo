package collectionsFramework;
/*
ArrayList����������ʾ�Ĺ��캯����
ArrayList����
ArrayList��Collection<��extends E>c��
ArrayList��int capacity��
��1�����캯������һ���յ������б���2�����캯������һ�������б�ʹ�ü���c��Ԫ�ؽ��г�ʼ������3�����캯������һ����ʼ����Ϊcapacity�������б�
���������ڴ洢Ԫ�ص�����Ĵ�С�����������б������Ԫ��ʱ���������Զ�������
����ĳ�����ʾ��ArrayList��ļ�Ӧ�á��ó���ΪString���͵Ķ��󴴽���һ�������б�Ȼ������������˼����ַ���������һ�£������ŵ��ַ����ᱻת��
ΪString���󣩡�Ȼ����ʾ����б��Ƴ�һЩԪ�غ��ٴ���ʾ����б�
   */

import java.util.*;

//Demonstrate ArrayList.
public class ArrayListDemo {
    public static void main(String args[]) {
//Create an array list.
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial size of al:" + al.size());
//Add elements to the array list.
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Size of al after additions:" + al.size());
//Display the array list.
        System.out.println("Contents of al:" + al);
//Remove elements from the array list.
        al.remove("F");
        al.remove(2);
        System.out.println("Size of al after deletions:" + al.size());
        System.out.println("Contents of al:" + al);
    }
}