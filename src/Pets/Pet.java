package Pets;

/*
 * 宠物类
 */
public class Pet {
    private int number;//编号
    private String type;//种类
    private String name;//名字
    private int age;//年龄

    //------------------构造方法------------------------
    public Pet() {
    }

    public Pet(int number, String type, String name, int age) {
        this.number = number;
        this.type = type;
        this.name = name;
        this.age = age;
    }

    //-------------------get and set 方法------------------------------
    public int getNumber() {
        return number;
    }

    /*public void setNumber(int number) {
        this.number = number;
    }*/
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            return;
        }
        this.age = age;
    }

    //--------------------toString 方法--------------------------
    @Override
    public String toString() {
        return "Pet [编号=" + number + ", 种类=" + type + ", 昵称=" + name + ", 年龄=" + age + "]";
    }

    /*
     * 重写 hashCode() and equals() 方法，依靠number判断是否重复
     *
     * （非 Javadoc）
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + number;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pet other = (Pet) obj;
        if (number != other.number)
            return false;
        return true;
    }
}
