package Design;

/*
��������ģʽ�����ĸ���ɫ�����󹤳�ģʽ�����幤��ģʽ�������Ʒģʽ�������Ʒģʽ����������һ��������ȥʵ��������Ĳ�Ʒ�������ɳ��󹤳�������
ȥʵ������Ʒ
 */
public class TestFactoryMethodMode {
    public static void main(String[] args) {
        VehicleFactory factory = new BroomFactory();
        Moveable m = factory.create();
        m.run();
    }
}


// �����Ʒ��ɫ
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

// ���󹤳�
abstract class VehicleFactory {
    abstract Moveable create();
}

// ���幤��
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
