package Class;

//Á·Ï°¼Ì³ĞºÍÖØĞ´
class a {
    int day = 0;
    double weight;

    String say() {
        System.out.println("½ñÍí³Ô·¹ÁËÂğ£¿");
        return null;
    }
}

class b {
    void say() {
        System.out.println("Ã÷Ìì³ÔÔç²ÍÂğ£¿");
    }
}

class c extends a {
    String say() {
        System.out.println("³Ô¹ıÁË");
        return null;
    }
}

class d extends b {
    String t = "8:00";

    void say() {
        System.out.println("Ã÷Ìì" + t + "³ÔÔç²ÍÂğ£¿");
    }
}

public class override_overload {


    public static void main(String[] args) {
        a test = new a();
        test.day = 2;
        test.weight = 24.00;
        System.out.println(test.day + "\n" + test.weight);
        test.say();
        b test2 = new b();
        test2.say();
        c test3 = new c();
        test3.say();
        d test4 = new d();
        test4.say();
    }

    ;
}


