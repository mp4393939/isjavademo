package Class;
class box4 {
    Double width;
    Double height;
    Double depth;

    box4(Double w, Double h, Double d) {
        width = w;
        height = h;
        depth = d;
    }

    Double result() {
        return width * height * depth;
    }
}

public class gouzaohanshu2 {
    public static void main(String[] args) {

        box4 r = new box4(1.00, 2.00, 4.00);
        System.out.println("result:" + r.width * r.height * r.depth);
        //ͨ�����ö����ʵ������������
        Double result;
        result = r.result();
        System.out.println("result:" + result);
        //r2���ö�������¸�ֵ
        box4 r2 = r;
        r2.width = 5.00;
        r2.height = 6.00;
        r2.depth = 8.00;
        result = r.result();
        System.out.println("result:" + result);

    }

}
