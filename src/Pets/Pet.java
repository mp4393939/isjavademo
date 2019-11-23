package Pets;

/*
 * ������
 */
public class Pet {
    private int number;//���
    private String type;//����
    private String name;//����
    private int age;//����

    //------------------���췽��------------------------
    public Pet() {
    }

    public Pet(int number, String type, String name, int age) {
        this.number = number;
        this.type = type;
        this.name = name;
        this.age = age;
    }

    //-------------------get and set ����------------------------------
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

    //--------------------toString ����--------------------------
    @Override
    public String toString() {
        return "Pet [���=" + number + ", ����=" + type + ", �ǳ�=" + name + ", ����=" + age + "]";
    }

    /*
     * ��д hashCode() and equals() ����������number�ж��Ƿ��ظ�
     *
     * ���� Javadoc��
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
