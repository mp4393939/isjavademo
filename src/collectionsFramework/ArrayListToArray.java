package collectionsFramework;
/*
从ArrayList 获取数组
使用ArrayList时，有时会希望获取包含列表内容的实际数组。可以调用toArray0方法来完成这一工作，该方法是由Collection接口定义的。由于某些原因，您可能希望将集合转换成数组，例如：
·为特定操作获取更快的处理速度
·为方法传递数组，并且方法没有接收集合的重载形式
·将基于集合的代码集成到不支持集合的遗留代码中
不管是什么原因，将ArrayList转换成数组都是很平常的事情。
前面解释过，toArray()方法有两个版本。为了便于分析，下面再次给出它们：
object[] toArray()
<T> T[] toArray(T array[])
第一个版本返回元素类型为Object的数组。第二个版本返回元素类型为T的数组。通常，第二个版本更方便，因为能返回恰当类型的数组，下面的程序演示了它的使用：
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