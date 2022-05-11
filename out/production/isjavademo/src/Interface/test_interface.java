package Interface;

//调用接口必须调用接口的全部方法
public class test_interface implements Expandable {
    @Override
    public void expand() {

        System.out.println("test_interface");
    }

    @Override
    public void expand2(int a) {
        System.out.println("i初始值:" + i + "\t" + "j初始值:" + j);
        double i2 = i;//改变接口的实例变量的数据类型
        float j2 = j;
        System.out.println("i传参后的值:" + i2 + "\t" + "传参后的值:" + j2);
        i2 = 100.00;//改变接口的实例变量的值
        j2 = 15000000;
        System.out.println("对i重新赋值后的值:" + i2 + "\t" + "对i重新赋值后的值:" + j2);
        System.out.println("a:" + a);
        ;

    }

    public static void main(String[] args) {
        test_interface test = new test_interface();
        test.expand();
        test.expand2(666);
    }

}
