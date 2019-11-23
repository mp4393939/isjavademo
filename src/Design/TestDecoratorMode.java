package Design;

/*
װ����ģʽ�������е�ҵ���߼���һ���ķ�װ��ʹ�����Ӷ���Ĺ��ܣ���Java�е�IO����ʹ����װ����ģʽ���û���ʹ�õ�ʱ�򣬿���������װ���ﵽ�Լ���Ҫ��
Ч���� �ٸ����ӣ�����������Σ���������Ҫһ�������㳦����ϲ�������ͣ����㳦�����һ�����ͣ��ٷ�һ���߲ˣ����������Ƭ�����һ�£��ܷ�ʢ��һ
���緹��Ӫ���ֽ�����
 */
public class TestDecoratorMode {
    public static void main(String[] args) {
        Food food = new Bread(new Vegetable(new Cream(new Food("�㳦"))));
        System.out.println(food.make());
        Food food2 = new Vegetable(new Cream(new Vegetable(new Food("���"))));
        System.out.println(food2.make());
    }
}

class Food {

    private String food_name;

    Food() {
    }

    void printName() {
    }

    Food(String food_name) {
        this.food_name = food_name;
    }

    public String make() {
        return food_name;
    }
}//�����

class Bread extends Food {

    private Food basic_food;

    Bread(Food basic_food) {
        this.basic_food = basic_food;
    }

    public String make() {
        return basic_food.make() + "+���";
    }
}

//������
class Cream extends Food {

    private Food basic_food;

    Cream(Food basic_food) {
        this.basic_food = basic_food;
    }

    public String make() {
        return basic_food.make() + "+����";
    }
}


//�߲���
class Vegetable extends Food {

    private Food basic_food;

    Vegetable(Food basic_food) {
        this.basic_food = basic_food;
    }

    public String make() {
        return basic_food.make() + "+�߲�";
    }

}