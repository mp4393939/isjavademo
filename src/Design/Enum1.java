package Design;

/*
����ģʽ������ö�ٷ�ʽ��Effective Java����Josh Bloch �ᳫ�ķ�ʽ���������ܱ�����߳�ͬ�����⣬���һ��ܷ�ֹ�����л����´����µĶ��󣬿�ν�Ǻܼ�ǿ�ı��ݰ���������
������Ϊ����1.5�вż���enum���ԣ������ַ�ʽд�������˸о����衣
 */
public class Enum1 {
    public enum Singleton {
        INSTANCE;

        public void whateverMethod() {
        }
    }

    public static void main(String[] args) {
        Enum1 en = new Enum1();
        System.out.println(en.toString());
    }
}
