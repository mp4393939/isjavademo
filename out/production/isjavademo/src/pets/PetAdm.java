package pets;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * ���������
 * ʵ����ɾ�Ĳ�Ĺ���
 */
class PetAdm implements Serializable {
    Set<Pet> hashSetPet;

    public PetAdm() {
        hashSetPet = new HashSet<Pet>();
		/*add(new Pet("\u0031", "\u5355\u8eab\u72d7",
				"\u65fa\u8d22", \u0032\u0033));*/

    }


    //���
    public boolean add(Pet p) {
        return hashSetPet.add(p);
    }

    //ɾ��
    public boolean delete(int number) {
        Pet p = find(number);
        return hashSetPet.remove(p);
    }

    //�޸�
    public void update(Pet p) {
        Pet cat = find(p.getNumber());
        cat.setType(p.getType());
        cat.setName(p.getName());
        cat.setAge(p.getAge());
        System.out.println("�޸���ɣ�");
    }

    //����
    public Pet find(int number) {
        Pet[] pet = hashSetPet.toArray(new Pet[]{});//ת��Ϊ����

        //�������飬�����ͬ�򷵻ض��󣬷��򷵻�null
        for (Pet p : pet) {
            if (number == p.getNumber()) return p;
        }
        return null;
    }

    //������г�����Ϣ
    public void print() {
        //�������ϲ����
        for (Iterator iterator = hashSetPet.iterator(); iterator.hasNext(); ) {
            Pet pet = (Pet) iterator.next();
            if (pet.getNumber() == 1111) continue;
            System.out.println(pet);
        }
    }
}
