package Design;

/*
���󹤳�ģʽ���빤������ģʽ��ͬ���ǣ���������ģʽ�еĹ���ֻ������һ�Ĳ�Ʒ�������󹤳�ģʽ�еĹ������������Ʒ
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

//���󹤳���
abstract class AbstractFactory {
    public abstract Vehicle createVehicle();

    public abstract Weapon createWeapon();

    public abstract Food1 createFood();
}


//���幤���࣬����Food,Vehicle��Weapon�ǳ����࣬
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
        System.out.println("Vehicle���run()����");
    }

}

abstract class Weapon {

    void shoot() {
        System.out.println("Weapon���shoot()����");
    }
}

abstract class Food1 extends Food {
    //���ط���
    void printName() {
        System.out.println("Food1���printName()����");
    }
}

class Apple extends Food1 {
}

class Bus extends Vehicle {
}

class AK47 extends Weapon {
}