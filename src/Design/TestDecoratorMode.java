package Design;

/*
装饰者模式：对已有的业务逻辑进一步的封装，使其增加额外的功能，如Java中的IO流就使用了装饰者模式，用户在使用的时候，可以任意组装，达到自己想要的
效果。 举个栗子，我想吃三明治，首先我需要一根大大的香肠，我喜欢吃奶油，在香肠上面加一点奶油，再放一点蔬菜，最后再用两片面包夹一下，很丰盛的一
顿午饭，营养又健康。
 */
public class TestDecoratorMode {
    public static void main(String[] args) {
        Food food = new Bread(new Vegetable(new Cream(new Food("香肠"))));
        System.out.println(food.make());
        Food food2 = new Vegetable(new Cream(new Vegetable(new Food("面包"))));
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
}//面包类

class Bread extends Food {

    private Food basic_food;

    Bread(Food basic_food) {
        this.basic_food = basic_food;
    }

    public String make() {
        return basic_food.make() + "+面包";
    }
}

//奶油类
class Cream extends Food {

    private Food basic_food;

    Cream(Food basic_food) {
        this.basic_food = basic_food;
    }

    public String make() {
        return basic_food.make() + "+奶油";
    }
}


//蔬菜类
class Vegetable extends Food {

    private Food basic_food;

    Vegetable(Food basic_food) {
        this.basic_food = basic_food;
    }

    public String make() {
        return basic_food.make() + "+蔬菜";
    }

}