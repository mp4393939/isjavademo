package Extends;
class A{
    int i,j;
    void showij() {
        System.out.println("i and j:" + i + " " + j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("k:"+k);
    }
    void sum(){
        System.out.println("i+j+k:"+(i+j+k));
    }
}
public class extends_showij_sum {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        a.i=10;
        a.j=20;
        System.out.println("通过对A的变量赋值后的输出:");
        a.showij();
        b.i=100;
        b.j=200;
        b.k=300;
        System.out.println("通过对B的变量赋值后的输出:");
        b.showij();
        b.showk();
        b.sum();
    }
}
