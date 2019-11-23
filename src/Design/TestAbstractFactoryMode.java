package Design;

/*
抽象工厂模式：与工厂方法模式不同的是，工厂方法模式中的工厂只生产单一的产品，而抽象工厂模式中的工厂生产多个产品
 */
public class TestAbstractFactoryMode {
    public static void main(String[] args) {
        AbstractFactory f = new DefaultFactory();
        Vehicle v = f.createVehicle();
        v.run();
        Weapon w = f.createWeapon();
        w.shoot();
        Food1 a = f.createFood();
        a.printName();
    }
}

//抽象工厂类
abstract class AbstractFactory {
    public abstract Vehicle createVehicle();

    public abstract Weapon createWeapon();

    public abstract Food1 createFood();
}


//具体工厂类，其中Food,Vehicle，Weapon是抽象类，
class DefaultFactory extends AbstractFactory {
    @Override
    public Food1 createFood() {
        return new Apple();
    }

    @Override
    public Vehicle createVehicle() {
        return new Bus();
    }

    @Override
    public Weapon createWeapon() {
        return new AK47();
    }
}

abstract class Vehicle {

    void run() {
        System.out.println("Vehicle类的run()方法");
    }

}

abstract class Weapon {

    void shoot() {
        System.out.println("Weapon类的shoot()方法");
    }
}

abstract class Food1 extends Food {
    //重载方法
    void printName() {
        System.out.println("Food1类的printName()方法");
    }
}

class Apple extends Food1 {
}

class Bus extends Vehicle {
}

class AK47 extends Weapon {
}