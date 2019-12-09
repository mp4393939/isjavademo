package collectionsFramework;

import java.util.HashMap;
/*
Hashapʵ���˽ӿ�Map�����ṩ�˼�ӳ�����ݽṹ������ʵ�֡�ɢ��ӳ�������ܹ�����ĳ�����͵ļ�ֵ���洢���ݣ��������ɸ���ϵ�������Ч�ʡ�����ϵ����һ��
0.0-1.0�ĸ���������������ɢ��ӳ������Լ���ʱΪ�����Ԫ�ط���ռ䡣
������һ����ɢ��ӳ��Ҳ��������������ڴ�������ɢ��ӳ��ͨ������ǰ����ͬ�����͸���ϵ�̵ĳ˻����бȽ��������ڴ档������ȳ���������˻���ɢ��ӳ��
��ͨ������ɢ�У�rehash������������������ϵ��Խ�ӽ�1.0���ڴ�ʹ��Ч��Խ�ߣ��������ǲ���Ԫ�ص�ʱ��Խ����ͬ��������ϵ��Խ�ӽ���0.0�����ҵ�Ч��Խ�ߣ�
���˷ѵ��ڴ�Խ�ࡣ����ɢ��ӳ��ĸ���ϵ��ʱ��ȡ���ڽ����ʹ��ɢ��ӳ���Լ����ص������ܻ����ڴ��ʹ��Ч�ʡ�
������3�ַ�ʽ֮һ������ɢ��ӳ�䡣
��һ�����캯������Ĭ�ϵ�ɢ��ӳ�䣬���ʼ����Ϊ16������ϵ��Ϊ0.75��
Hashmap hash=new Hashmap();
��һ�����캯����������ָ����ʼ�����Ҹ���ϵ��Ϊ0.75��ɢ��ӳ�䣺
Hashmap hash=new Hashmap(20);
���������캯�����������ƶ���ʱ�����͸���ϵ����ɢ��ӳ�䣺
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
