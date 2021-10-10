package collectionsFramework;

import java.util.*;

/*
1. LinkedList和ArrayList的差别主要来自于Array和LinkedList数据结构的不同。ArrayList是基于数组实现的，LinkedList是基于双链表实现的。另外LinkedList类
不仅是List接口的实现类，可以根据索引来随机访问集合中的元素，除此之外，LinkedList还实现了Deque接口，Deque接口是Queue接口的子接口，它代表一个双向队列，
因此LinkedList可以作为双向队列 ，栈（可以参见Deque提供的接口方法）和List集合使用，功能强大。
2.在LinkedList的内部实现中，并不是用普通的数组来存放数据的，而是使用结点<Node>来存放数据的，有一个指向链表头的结点first和一个指向链表尾的结点last。不同于
ArrayList只能在数组末尾添加数据，LinkList可以很方便在链表头或者链表尾插入数据，或者在指定结点前后插入数据，还提供了取走链表头或链表尾的结点，或取走中间
某个结点，还可以查询某个结点是否存在。add()方法默认在链表尾部插入数据。总之，LinkedList提供了大量方便的操作方法，并且它的插入或增加等方法的效率明显高于
ArrayList类型，但是查询的效率要低一点，因为它是一个双向链表。
3. LinkedList需要更多的内存，因为ArrayList的每个索引的位置是实际的数据，而LinkedList中的每个节点中存储的是实际的数据和前后节点的位置。

使用场景：
（1）如果应用程序对数据有较多的随机访问，ArrayList对象要优于LinkedList对象；
（2） 如果应用程序有更多的插入或者删除操作，较少的随机访问，LinkedList对象要优于ArrayList对象；
（3）不过ArrayList的插入，删除操作也不一定比LinkedList慢，如果在List靠近末尾的地方插入，那么ArrayList只需要移动较少的数据，而LinkedList则需要一直
查找到列表尾部，反而耗费较多时间，这时ArrayList就比LinkedList要快。
*/
public class RemoveListElement {
    public static void main(String[] args) {
        UseArrayList();
        UseLinkedList();
    }

    public static void UseArrayList() {
        List<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list, 1, 2, 3, 5, 6);
    /*删除集合中集合中存在符合条件的元素时，为了避免IndexOutOfBoundsException、ConcurrentModificationException异常，可以使用Iterator的remove方法，
    该方法会删除当前迭代对象的同时，维护索引的一致性。*/
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            if (value == 3 || value == 5) {
                it.remove();
            }
        }
        System.out.println(list);
    }

    public static void UseLinkedList() {
        List<Integer> list = new LinkedList<Integer>();
        Collections.addAll(list, 1, 2, 3, 5, 6);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer value = it.next();
            if (value == 3 || value == 5) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}
