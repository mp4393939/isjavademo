package exception;

/*
HashMap��Map�ӿڵĹ�ϣ��ʵ�֣�����������˼���ֵ�Ļ������ÿ��ֵ����Ψһ����أ�������������ֵ�Եļ��Ѿ�������HashMap�����ĵ�ǰֵ���滻��
���ǵ���Կ������ṩequals������hashcode������������ȷʵ�֡�û�����ǣ����޷���֤������һ���õ���Կ��
ͨ��������equals������hashcode��������������һ����һ�����HashMap�����ͬ�ļ��������ǰ�ԭ���滻����HashMap�����������޷�ʶ����Щ��ͬ�ļ����׳�OutOfMemoryError ��
ע�⣺�ڴ�й©�������ڵ�14�е�����ѭ��������ѭ�����ܵ�����Դ�ľ��������ᵼ���ڴ�й©����������Ѿ���ȷʵ����equals������hashcode������������ô��ʹʹ������ѭ����
����Ҳ���������У���Ϊ������HashMap��ֻ��һ��Ԫ�ء�
 */
import java.util.Map;

//�ڴ�й©�쳣
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
