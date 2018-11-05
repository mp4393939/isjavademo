package Extends;
class a{
    int i,j;
    a(int a,int b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println("i and j:"+i+" "+j);
    }
}
class b extends a{
    int k;
    //重写方法
    b(int a, int b,int c) {
        super(a, b);
        k=c;
    }
    void show(){
        //调用超类的方法
        super.show();
        System.out.println("k:"+k);
    }
}
public class override_show {
    public static void main(String[] args) {
        a a=new a(1,2);
        b b=new b(10,200,300);
        System.out.println("类a的方法输出");
        a.show();
        System.out.println("类b的方法输出");
        b.show();
    }
}
