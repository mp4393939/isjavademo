package design;

//简单工厂模式：一个抽象的接口，多个抽象接口的实现类，一个工厂类，用来实例化抽象的接口
public class TestSimpleFactoryMode {
    public static void main(String[] args) {
        Car c = Factory.getCarInstance("Benz");
        if (c != null) {
            c.run();
            c.stop();
        } else {
            System.out.println("造不了这种汽车。。。");
        }

    }
}

// 抽象产品类
abstract class Car {
    public void run() {
    }

    public void stop() {
    }
}

// 具体实现类
class Benz extends Car {
    public void run() {
        System.out.println("Benz开始启动了");
    }

    public void stop() {
        System.out.println("Benz停车了");
    }
}

class Ford extends Car {
    public void run() {
        System.out.println("Ford开始启动了");
    }

    public void stop() {
        System.out.println("Ford停车了");
    }
}

// 工厂类
class Factory {
    static Car getCarInstance(String type) {
        Car c = null;
        if ("Benz".equals(type)) {
            c = new Benz();
        }
        if ("Ford".equals(type)) {
            c = new Ford();
        }
        return c;
    }
}