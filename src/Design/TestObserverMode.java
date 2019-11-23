package Design;

import java.util.ArrayList;
import java.util.List;

//观察者模式：对象间一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
public class TestObserverMode {

    public static void main(String[] args) {

        XiaoMei xiao_mei = new XiaoMei();
        LaoWang lao_wang = new LaoWang();
        LaoLi lao_li = new LaoLi();

        //老王和老李在小美那里都注册了一下
        xiao_mei.addPerson(lao_wang);
        xiao_mei.addPerson(lao_li);


        //小美向老王和老李发送通知
        xiao_mei.notifyPerson();
    }
}

class LaoWang implements Person {


    @Override
    public void getMessage(String s) {
        String name = "老王";
        System.out.println(name + "接到了小美打过来的电话，电话内容是：" + s);
    }

}

class LaoLi implements Person {


    @Override
    public void getMessage(String s) {
        String name = "老李";
        System.out.println(name + "接到了小美打过来的电话，电话内容是：->" + s);
    }

}

class XiaoMei {
    private List<Person> list = new ArrayList<>();

    XiaoMei() {
    }

    void addPerson(Person person) {
        list.add(person);
    }

    //遍历list，把自己的通知发送给所有暗恋自己的人
    void notifyPerson() {
        for (Person person : list) {
            person.getMessage("你们过来吧，谁先过来谁就能陪我一起玩儿游戏!");
        }
    }
}
