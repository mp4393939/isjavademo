package Class;
class box1 {
    Double width;
    Double height;
    Double depth;
}

public class gouzaohanshu1 {

    @SuppressWarnings("null")
    public static void main(String[] args) {
        box1 r = new box1();
        r.width = 5.00;
        r.height = 4.00;
        r.depth = 3.00;
        System.out.println("result:" + r.width * r.height * r.depth);
        box1 r2 = r;
        r = null;
        System.out.println("修改之后r的实例变量:" + r.width + r.height + r.depth);
        System.out.println("r2的实例变量:" + r2.width + r2.height + r2.depth);


    }

}
