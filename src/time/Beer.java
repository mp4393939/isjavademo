package time;


class Beverage {
    Beverage() {
        System.out.print("beverage ");
    }
}

public class Beer extends Beverage {
    public Beer(int i) {
    }

    public static void main(String[] args) {
        Beer b = new Beer(14);
    }

    public int Beer(int x) {

        //this();
        System.out.print("beerl");
        return 0;
    }

    public Beer() {
        System.out.print("beer2 ");
    }
}