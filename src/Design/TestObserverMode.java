package Design;

import java.util.ArrayList;
import java.util.List;

//�۲���ģʽ�������һ�Զ��������ϵ����һ�������״̬�����ı�ʱ���������������Ķ��󶼵õ�֪ͨ�����Զ����¡�
public class TestObserverMode {

    public static void main(String[] args) {

        XiaoMei xiao_mei = new XiaoMei();
        LaoWang lao_wang = new LaoWang();
        LaoLi lao_li = new LaoLi();

        //������������С�����ﶼע����һ��
        xiao_mei.addPerson(lao_wang);
        xiao_mei.addPerson(lao_li);


        //С���������������֪ͨ
        xiao_mei.notifyPerson();
    }
}

class LaoWang implements Person {


    @Override
    public void getMessage(String s) {
        String name = "����";
        System.out.println(name + "�ӵ���С��������ĵ绰���绰�����ǣ�" + s);
    }

}

class LaoLi implements Person {


    @Override
    public void getMessage(String s) {
        String name = "����";
        System.out.println(name + "�ӵ���С��������ĵ绰���绰�����ǣ�->" + s);
    }

}

class XiaoMei {
    private List<Person> list = new ArrayList<>();

    XiaoMei() {
    }

    void addPerson(Person person) {
        list.add(person);
    }

    //����list�����Լ���֪ͨ���͸����а����Լ�����
    void notifyPerson() {
        for (Person person : list) {
            person.getMessage("���ǹ����ɣ�˭�ȹ���˭��������һ�������Ϸ!");
        }
    }
}
