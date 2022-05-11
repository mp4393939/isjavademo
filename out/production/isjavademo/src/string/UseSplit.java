package string;

public class UseSplit {
/*
split 方法：将一个字符串分割为子字符串，然后将结果作为字符串数组返回。stringObj.split([separator]，[limit])
参数：stringObj 必选项。要被分解的 String 对象或文字。该对象不会被 split 方法修改。
separator 可选项。字符串或 正则表达式 对象，它标识了分隔字符串时使用的是一个还是多个字符。如果忽
略该选项，返回包含整个字符串的单一元素数组。 limit可选项。该值用来限制返回数组中的元素个数。
说明：split 方法的结果是一个字符串数组，在 stingObj 中每个出现 separator 的位置都要进行分解。separator 不作为任何数组元素的部分返回。
split 的实现直接调用的 matcher 类的 split 的方法。“ . ”在正则表达式中有特殊的含义，因此我们使用的时候必须进行转义"\\."
 */

    public static void main(String[] args) {
        String str = "大 家  好   啊            ";
        String re = str.replaceAll("[\\s]{2,}", " ");
        System.out.println(re);//大 家 好 啊

        String line = "good12 morning34  good56   night78";
        //对String进行split之后的数组的输出
        String[] tt = line.split("\\s+");
        for (String t : tt) {
            System.out.print(t + "\t");//good12  morning34  good56 night78未改变
        }
        System.out.println();

        String originalString = new String("5,8,6,9,12,56,3");
        String[] destString = originalString.split(",");
        for (int i = 0; i < destString.length; i++)
            System.out.print(destString[i] + " ");//5 8 6 9 12 56 3
        System.out.println();

        String original = new String("abc,ef,bdj,983,r56,34u");
        String[] dest = original.split(",", 3);
        for (int i = 0; i < dest.length; i++)
            System.out.print(dest[i]);//abcefbdj,983,r56,34u
        System.out.println();

        String value2 = "ABCD|568|ER5|54P";
        String[] names2 = value2.split("\\|");
        for (int i = 0; i < names2.length; i++)
            System.out.print(names2[i]);//ABCD568ER554P
        System.out.println();

        String newstr = new String("   a b c d e f g h  i          ,j");
        String[] des = newstr.split("\\s", 0);//如果输入limit数值等于0,则会执行切割无限次并且去掉该数组最后的所有空字符串
        System.out.println("切割后长度为：" + des.length);//切割后长度为：23
        for (int i = 0; i < des.length; i++)
            System.out.print(des[i]);//abcdefghi,j
        System.out.println();
    }
}