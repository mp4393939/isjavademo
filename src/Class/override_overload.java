package Class;

//��ϰ�̳к���д
class a {
    int day = 0;
    double weight;

    String say() {
        System.out.println("����Է�����");
        return null;
    }
}

class b {
    void say() {
        System.out.println("����������");
    }
}

class c extends a {
    String say() {
        System.out.println("�Թ���");
        return null;
    }
}

class d extends b {
    String t = "8:00";

    void say() {
        System.out.println("����" + t + "�������");
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


