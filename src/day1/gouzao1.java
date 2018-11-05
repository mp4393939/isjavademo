package day1;
class box{
    double width,height,depth;
    box(double width,double height,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    void result(){
        System.out.println(this.width*this.height*this.depth);
    }
    /*boolean result(double length){


    }*/
}
public class gouzao1 {
    public static void main(String args[]){
        box t1=new box(4.00,5.00,6.00);
        t1.result();
        box t=t1;
        t.width=0;
        t.height=0;
        t.depth=0;
        t.result();

    }
}
