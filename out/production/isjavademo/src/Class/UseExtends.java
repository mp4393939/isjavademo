package Class;

//���������ķ�������ִ��
//���췽����������
public class UseExtends extends UseB {
    public UseExtends() {
        System.out.println("This is UseExtends Construction method");
    }

    public UseExtends(String a) {
        System.out.println("����UseExtends���췽��");
    }

    public static void main(String[] args) {
        UseExtends ue1 = new UseExtends();
        System.out.println("--------------------------------------------------------------");
        UseA ue2 = new UseA("");
        System.out.println("--------------------------------------------------------------");
        //�˴�UseA���޲εĹ��췽����ִ��һ��
        UseB ue3 = new UseB("");
        System.out.println("--------------------------------------------------------------");
        //�˴�UseA��UseB���޲εĹ��췽����ִ��һ��
        UseExtends ue4 = new UseExtends("");

    }
}

class UseA {
    public UseA() {
        System.out.println("This is UseA Construction method");
    }

    public UseA(String a) {
        System.out.println("����UseA���췽��");
    }
}

class UseB extends UseA {
    public UseB() {
        System.out.println("This is UseB Construction method");
    }

    public UseB(String a) {
        System.out.println("����UseB���췽��");
    }
}