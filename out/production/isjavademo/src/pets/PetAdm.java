package pets;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 宠物管理类
 * 实现增删改查的功能
 */
class PetAdm implements Serializable {
    Set<Pet> hashSetPet;

    public PetAdm() {
        hashSetPet = new HashSet<Pet>();
		/*add(new Pet("\u0031", "\u5355\u8eab\u72d7",
				"\u65fa\u8d22", \u0032\u0033));*/

    }


    //添加
    public boolean add(Pet p) {
        return hashSetPet.add(p);
    }

    //删除
    public boolean delete(int number) {
        Pet p = find(number);
        return hashSetPet.remove(p);
    }

    //修改
    public void update(Pet p) {
        Pet cat = find(p.getNumber());
        cat.setType(p.getType());
        cat.setName(p.getName());
        cat.setAge(p.getAge());
        System.out.println("修改完成！");
    }

    //查找
    public Pet find(int number) {
        Pet[] pet = hashSetPet.toArray(new Pet[]{});//转换为数组

        //遍历数组，编号相同则返回对象，否则返回null
        for (Pet p : pet) {
            if (number == p.getNumber()) return p;
        }
        return null;
    }

    //输出所有宠物信息
    public void print() {
        //遍历集合并输出
        for (Iterator iterator = hashSetPet.iterator(); iterator.hasNext(); ) {
            Pet pet = (Pet) iterator.next();
            if (pet.getNumber() == 1111) continue;
            System.out.println(pet);
        }
    }
}
