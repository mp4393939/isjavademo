package Design;

/*
单例模式：枚举
上面提到的四种实现单例的方式都有共同的缺点：
1、需要额外的工作来实现序列化，否则每次反序列化一个序列化的对象时都会创建一个新的实例。
2、可以使用反射强行调用私有构造器（如果要避免这种情况，可以修改构造器，让它在创建第二个实例的时候抛异常）。
而枚举类很好的解决了这两个问题，使用枚举除了线程安全和防止反射调用构造器之外，还提供了自动序列化机制，防止反序列化的时候创建新的对象。因此，《Effective Java》作者推荐使用的
方法。不过，在实际工作中，很少看见有人这么写。
 */
public enum Enum1 {
    //枚举元素本身就是单例
    INSTANCE;

    //添加自己需要的操作
    public void singletonOperation() {
        System.out.println("Enum");
    }

    public static void main(String[] args) {
        INSTANCE.singletonOperation();
        System.out.println(INSTANCE);
    }
}
