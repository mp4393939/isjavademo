package Class;

//继承的深入了解
public class ExtendsSignificance extends e2 {
    public static void main(String[] args) {
        e1 si = new ExtendsSignificance();
        //=前面虽然出现了类a，但ExtendsSignificance继承的是类b，这里重写的是类b的show()方法
        si.show();
    }
}

class e1 {
    int i, j;

    void show() {
        System.out.println("i and j:" + i + "" + j);
    }
}

class e2 extends e1 {
    private int k;

    void show() {
        System.out.println("k:" + k);
    }
}