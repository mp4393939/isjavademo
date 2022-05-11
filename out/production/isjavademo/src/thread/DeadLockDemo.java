package thread;

/*
������ָ�������ѭ���ȴ�����ռ�е���Դ�����޵Ľ�����ȥ�ľ��档����Ȼ��û���������ã���ô�����漰���ĸ������̶�����Զ����>����״̬�������ϵͳ���������ĸ���ԭ�����
��Դ�����Ҳ���������
�����������ĸ���Ҫ������
     1��������������Ϊĳ����Դ��һ��ʱ����ֻ����һ������ռ�У�����ͬʱ�����������������ϵĽ���ռ�С�
     2��������ռ��������������õ���Դ��δʹ�����֮ǰ����Դ�����߲���ǿ�д���Դռ�������ж�ȡ��Դ����ֻ���ɸ���Դռ���������ͷš�
     3��ռ�����������������������Ѿ�ռ��һ�����������������µ���Դ�����ڸ���Դ�ѱ��������ռ�У���ʱ�ý������������ǣ����ڵȴ��µ���Դ֮ʱ��
��Ȼ����ռ����ռ�õ���Դ��
     4����·�ȴ�������һ�����̵ȴ�����{P1,p2,..,pn}����P1�ȴ�P2��ռ�е���Դ��P2�ȴ�P3ռ�е���Դ��.....����Pn�ȴ�P1��ռ�е���Դ���γ�һ��
    ����ѭ���ȴ�����
   ��������˵���ĸ�����������ʱ��ͬʱ������Ҳ����˵��ֻҪ��һ����ҥ���������㣬�������Ϳ����ų���
 */
class Resource {
    private String name;
    private int resource;

    Resource(String name, int resource) {
        this.name = name;
        this.resource = resource;
    }

    String getName() {
        return name;
    }

    synchronized int doSome() {
        return ++resource;
    }

    synchronized void cooperate(Resource resource) {
        resource.doSome();
        System.out.printf("%s ���� %s ���YԴ%n",
                this.name, resource.getName());
    }
}

public class DeadLockDemo {
    public static void main(String[] args) {
        Resource resource1 = new Resource("resource1", 10);
        Resource resource2 = new Resource("resource2", 20);

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                resource1.cooperate(resource2);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                resource2.cooperate(resource1);
            }
        });

        thread1.start();
        thread2.start();
    }
}

