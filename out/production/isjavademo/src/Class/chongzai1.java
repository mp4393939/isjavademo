package Class;

class box2 {
    void method() {
        System.out.println("no parmater");
    }

    void method(int a) {
        System.out.println("a是int类型，a=" + a);
    }

    void method(double a) {
        System.out.println("a是double类型，a=" + a);
    }

    void method(boolean x) {
        if (x = true) {
            System.out.println("x is true");
        } else {
            System.out.println("x is flase");
        }
    }
}

public class chongzai1 {
    public static void main(String args[]) {
        box2 t = new box2();
        byte i = 1;
        t.method();
        t.method(5);
        t.method(8.88);
        t.method(true);
        t.method(i);


    }
}
