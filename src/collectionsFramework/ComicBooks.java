package collectionsFramework;

import java.util.HashMap;
/*
Hashap实现了接口Map，并提供了键映射数据结构的完整实现。散列映射让您能够基于某种类型的键值来存储数据，并具有由负载系数定义的效率。负载系数是一个
0.0-1.0的浮点数，它决定了散列映射如何以及何时为更多的元素分配空间。
与链表一样，散列映射也有容量（分配的内存量）。散列映射通过将当前长度同容量和负载系教的乘积进行比较来分配内存。如果长度超过了这个乘积，散列映射
将通过重新散列（rehash）来增加容量。负载系数越接近1.0，内存使用效幸越高，但代价是查找元素的时间越长。同样，负载系数越接近于0.0，查找的效率越高，
但浪费的内存越多。决定散列映射的负载系数时，取决于将如何使用散列映射以及看重的是性能还是内存的使用效率。
可以用3种方式之一来创建散列映射。
第一个构造函数创建默认的散列映射，其初始容量为16，负载系数为0.75：
Hashmap hash=new Hashmap();
第一个构造函数创建具有指定初始容量且负载系数为0.75的散列映射：
Hashmap hash=new Hashmap(20);
第三个构造函数创建具有制定出时容量和负载系数的散列映射：
Hashmap hash=new Hashmap(20,0.5F);
*/
public class ComicBooks {
    public ComicBooks() {
    }

    public static void main(String[] arguments) {
        // set up hash map
        HashMap quality = new HashMap();
        float price1 = 3.00F;
        quality.put("mint", price1);
        float price2 = 2.00F;
        quality.put("near mint", price2);
        float price3 = 1.50F;
        quality.put("very fine", price3);
        float price4 = 1.00F;
        quality.put("fine", price4);
        float price5 = 0.50F;
        quality.put("good", price5);
        float price6 = 0.25F;
        quality.put("poor", price6);
        // set up collection
        Comic[] comix = new Comic[3];
        comix[0] = new Comic("Amazing Spider-Man", "1A", "very fine",
                12_000.00F);
        comix[0].setPrice((Float) quality.get(comix[0].condition));
        comix[1] = new Comic("Incredible Hulk", "181", "near mint",
                680.00F);
        comix[1].setPrice((Float) quality.get(comix[1].condition));
        comix[2] = new Comic("Cerebus", "1A", "good", 190.00F);
        comix[2].setPrice((Float) quality.get(comix[2].condition));
        for (int i = 0; i < comix.length; i++) {
            System.out.println("Title: " + comix[i].title);
            System.out.println("Issue: " + comix[i].issueNumber);
            System.out.println("Condition: " + comix[i].condition);
            System.out.println("Price: $" + comix[i].price + "\n");
        }
    }
}

class Comic {
    String title;
    String issueNumber;
    String condition;
    float basePrice;
    float price;

    Comic(String inTitle, String inIssueNumber, String inCondition,
          float inBasePrice) {

        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }

    void setPrice(float factor) {
        price = basePrice * factor;
    }
}
