package design;

//�򵥹���ģʽ��һ������Ľӿڣ��������ӿڵ�ʵ���࣬һ�������࣬����ʵ��������Ľӿ�
public class TestSimpleFactoryMode {
    public static void main(String[] args) {
        Car c = Factory.getCarInstance("Benz");
        if (c != null) {
            c.run();
            c.stop();
        } else {
            System.out.println("�첻����������������");
        }

    }
}

// �����Ʒ��
abstract class Car {
    public void run() {
    }

    public void stop() {
    }
}

// ����ʵ����
class Benz extends Car {
    public void run() {
        System.out.println("Benz��ʼ������");
    }

    public void stop() {
        System.out.println("Benzͣ����");
    }
}

class Ford extends Car {
    public void run() {
        System.out.println("Ford��ʼ������");
    }

    public void stop() {
        System.out.println("Fordͣ����");
    }
}

// ������
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