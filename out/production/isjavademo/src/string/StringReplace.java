package string;

public class StringReplace {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------------");
        String a = "我是 f_static_000 的 f_static_001 aaa f_static_001";
        //replaceAll()替换此字符串中与文本目标匹配的每个子字符串
        a = a.replaceAll("f_static_\\d{3}", "#[face/png/$0]#");
        System.out.println(a);
        System.out.println("------------------------------------------------------------------------------");
        String b = "我是 f_static_000 的 f_static_001 aaa f_static_001";
        //replaceFirst()替换字符串第一个匹配给定的正则表达式的子字符串
        b = b.replaceFirst("f_static_\\d{3}", "#[face/png/$0]#");
        System.out.println(b);
        System.out.println("------------------------------------------------------------------------------");
        String c = "139 139恩怨情仇\n" +
                "\n" + "139" +
                "\uFEFF   +\"139\"+ 语罢,殿下的众大臣也纷纷下跪请太子下令将梅贵妃列入陪葬嫔妃之列139。";
        c = c.replaceFirst("139", "第139章");
        System.out.println(c);
        System.out.println("------------------------------------------------------------------------------");
        c = c.replaceAll("139", "第139章");
        System.out.println(c);
    }
}
