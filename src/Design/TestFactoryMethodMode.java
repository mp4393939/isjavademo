package Design;

/*
工厂方法模式：有四个角色，抽象工厂模式，具体工厂模式，抽象产品模式，具体产品模式。不再是由一个工厂类去实例化具体的产品，而是由抽象工厂的子类
去实例化产品
 */
public class TestFactoryMethodMode {
    public static void main(String[] args) {
        VehicleFactory factory = new BroomFactory();
        Moveable m = factory.create();
        m.run();
    }
}


// 具体产品角色
class Plane implements Moveable {
    @Override
    public void run() {
        System.out.println("plane....");
    }
}

class Broom implements Moveable {
    @Override
    public void run() {
        System.out.println("broom.....");
    }
}

// 抽象工厂
abstract class VehicleFactory {
    abstract Moveable create();
}

// 具体工厂
class PlaneFactory extends VehicleFactory {
    public Moveable create() {
        return new Plane();
    }
}

class BroomFactory extends VehicleFactory {
    public Moveable create() {
        return new Broom();
    }
}
