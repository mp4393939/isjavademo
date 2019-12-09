package thread;

public class ThreadTest {
    public static void main(String[] args) {
        Callme c1 = new Callme();
        Caller c2 = new Caller(c1, "");
        c1.call("1234");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //c2是实现类Callme的一个实例，类Callme有两条打印
        c2.target.call("890");
        c2.t.setName("test");
        System.out.println(c2.msg);
        System.out.println(c2.msg.length());
    }
}
