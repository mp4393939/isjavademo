package kinglian;

import java.util.UUID;

/*下面例子最多创建一个类实例的示例方法是将其所有构造函数声明为private，然后创建一个返回该类的唯一实例的公共方法。
我们声明了一个Singleton类的静态实例。该实例在该getInstance方法内最多初始化一次。注意使用null启用唯一实例
创建的值*/
class Singleton {

    private static Singleton single = null;
    private String ID = null;

    private Singleton() {
        /* Make it private, in order to prevent the creation of new instances of
         * the Singleton class. */

        ID = UUID.randomUUID().toString(); // Create a random ID.
    }

    public static Singleton getInstance() {
        if (single == null)
            single = new Singleton();

        return single;
    }

    public String getID() {
        return this.ID;
    }
}

public class TestSingleton {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        System.out.println(s.getID());
    }

}
