package algorithm;

/**
 * twitter��snowflake�㷨 -- javaʵ��
 * Twitter��ѩ���㷨SnowFlake��ʹ��Java����ʵ�֡�
 * SnowFlake�㷨��������64λ��ID���պÿ�����long���ʹ洢���ܹ����ڷֲ�ʽϵͳ������Ψһ��ID�� �������ɵ�ID�д��µ�˳�� �����ʵ���У����ɵ�64λID���Էֳ�5�����֣�
 * 0 - 41λʱ��� - 5λ�������ı�ʶ - 5λ������ʶ - 12λ���к�
 * 5λ�������ı�ʶ��5λ������ʶ�����ķ�������ǵ�ǰʵ���з���ģ����ҵ������ʵ����Ҫ�����԰������ķ���������䣬��10λ������ʶ������Ҫ�������ı�ʶ��
 *
 * @author beyond
 * @date 2016/11/26
 */
public class SnowFlake {

    /**
     * ��ʼ��ʱ���
     */
    private final static long START_STMP = 1480166465631L;

    /**
     * ÿһ����ռ�õ�λ��
     */
    private final static long SEQUENCE_BIT = 12; //���к�ռ�õ�λ��
    private final static long MACHINE_BIT = 5;   //������ʶռ�õ�λ��
    private final static long DATACENTER_BIT = 5;//��������ռ�õ�λ��

    /**
     * ÿһ���ֵ����ֵ
     */
    private final static long MAX_DATACENTER_NUM = -1L ^ (-1L << DATACENTER_BIT);
    private final static long MAX_MACHINE_NUM = -1L ^ (-1L << MACHINE_BIT);
    private final static long MAX_SEQUENCE = -1L ^ (-1L << SEQUENCE_BIT);

    /**
     * ÿһ���������λ��
     */
    private final static long MACHINE_LEFT = SEQUENCE_BIT;
    private final static long DATACENTER_LEFT = SEQUENCE_BIT + MACHINE_BIT;
    private final static long TIMESTMP_LEFT = DATACENTER_LEFT + DATACENTER_BIT;

    private long datacenterId;  //��������
    private long machineId;     //������ʶ
    private long sequence = 0L; //���к�
    private long lastStmp = -1L;//��һ��ʱ���

    public SnowFlake(long datacenterId, long machineId) {
        if (datacenterId > MAX_DATACENTER_NUM || datacenterId < 0) {
            throw new IllegalArgumentException("datacenterId can't be greater than MAX_DATACENTER_NUM or less than 0");
        }
        if (machineId > MAX_MACHINE_NUM || machineId < 0) {
            throw new IllegalArgumentException("machineId can't be greater than MAX_MACHINE_NUM or less than 0");
        }
        this.datacenterId = datacenterId;
        this.machineId = machineId;
    }

    /**
     * ������һ��ID
     *
     * @return
     */
    public synchronized long nextId() {
        long currStmp = getNewstmp();
        if (currStmp < lastStmp) {
            throw new RuntimeException("Clock moved backwards.  Refusing to generate id");
        }

        if (currStmp == lastStmp) {
            //��ͬ�����ڣ����к�����
            sequence = (sequence + 1) & MAX_SEQUENCE;
            //ͬһ������������Ѿ��ﵽ���
            if (sequence == 0L) {
                currStmp = getNextMill();
            }
        } else {
            //��ͬ�����ڣ����к���Ϊ0
            sequence = 0L;
        }

        lastStmp = currStmp;

        return (currStmp - START_STMP) << TIMESTMP_LEFT //ʱ�������
                | datacenterId << DATACENTER_LEFT       //�������Ĳ���
                | machineId << MACHINE_LEFT             //������ʶ����
                | sequence;                             //���кŲ���
    }

    private long getNextMill() {
        long mill = getNewstmp();
        while (mill <= lastStmp) {
            mill = getNewstmp();
        }
        return mill;
    }

    private long getNewstmp() {
        return System.currentTimeMillis();
    }

    public static void main(String[] args) {
        SnowFlake snowFlake = new SnowFlake(2, 3);

        for (int i = 0; i < (1 << 12); i++) {
            System.out.println(snowFlake.nextId());
        }

    }
}