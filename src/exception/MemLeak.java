package exception;

/*
HashMap是Map接口的哈希表实现，因此它定义了键和值的基本概念：每个值都与唯一键相关，因此如果给定键值对的键已经存在于HashMap，它的当前值被替换。
我们的密钥类必须提供equals（）和hashcode（）方法的正确实现。没有它们，就无法保证会生成一个好的密钥。
通过不定义equals（）和hashcode（）方法，我们一遍又一遍地向HashMap添加相同的键，而不是按原样替换键，HashMap不断增长，无法识别这些相同的键并抛出OutOfMemoryError 。
注意：内存泄漏不是由于第14行的无限循环：无限循环可能导致资源耗尽，但不会导致内存泄漏。如果我们已经正确实现了equals（）和hashcode（）方法，那么即使使用无限循环，
代码也能正常运行，因为我们在HashMap中只有一个元素。
 */
import java.util.Map;

//内存泄漏异常
public class MemLeak {
    public final String key;

    public MemLeak(String key) {
        this.key = key;
    }

    public static void main(String args[]) {
        try {
            Map map = System.getProperties();
            for (; ; ) {
                map.put(new MemLeak("key"), "value");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
