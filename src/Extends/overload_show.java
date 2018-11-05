package Extends;
class c{
    int i,j;
    c(int a,int b){
        i=a;
        j=b;
    }
    void show(){
        System.out.println("i and j:"+i+" "+j);
    }
}
class d extends c{
    int k;
    //重写方法
    d(int a, int b,int c) {
        super(a, b);
        k=c;
    }
    //重载方法:改变方法的参数不会发生重写（名称隐藏），只是重载超累的show()版本
    void show(String msg){
        //调用超类的方法
      System.out.println(msg+k);
    }
}
public class overload_show {
    public static void main(String[] args) {
        d d=new d(1,2,3);
        d.show("This is k:");
        d.show();
    }
}
