package Class;

/**
 * java中的按值调用
 *
 * @author zejian
 */
public class CallByValue {
    private static User user = null;
    private static User stu = null;

    /**
     * 交换两个对象
     *
     * @param x
     * @param y
     */
    public static void swap(User x, User y) {
        User temp = x;
        x = y;
        y = temp;
    }


    public static void main(String[] args) {
        user = new User("user", 26);
        stu = new User("stu", 18);
        System.out.println("调用前user的值：" + user.toString());
        System.out.println("调用前stu的值：" + stu.toString());
        swap(user, stu);
        System.out.println("调用后user的值：" + user.toString());
        System.out.println("调用后stu的值：" + stu.toString());
    }
}


class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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
        this.age = age;
    }
}


