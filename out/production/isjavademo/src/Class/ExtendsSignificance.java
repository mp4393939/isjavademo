package Class;

//�̳е������˽�
public class ExtendsSignificance extends e2 {
    public static void main(String[] args) {
        e1 si = new ExtendsSignificance();
        //=ǰ����Ȼ��������a����ExtendsSignificance�̳е�����b��������д������b��show()����
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