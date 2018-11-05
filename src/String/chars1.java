package String;

public class chars1 {
    public static void main(String args[]){
        char char1[]={'j','a','v','a','i','s','a','l','a','n','g','u','a','g','e'};
        //构造函数使用合并的字符串初始化实例
        String t1=new String(char1);
        System.out.println(t1);
        try{String t2=new String(char1,2,4);
                System.out.println(t2);
            String t3=new String(char1,99,100);
            System.out.println(t3);
            }catch(StringIndexOutOfBoundsException e) {
            System.out.println("java.lang.StringIndexOutOfBoundsException");
        }




    }
}
