package Class;

/*
����һ����ʾѧ����Ϣ����Student��Ҫ�����£�
��1����Student�ĳ�Ա������
sNO����ʾѧ�ţ�sName��ʾ������sSex��ʾ�Ա�sAge��ʾ���䣻sJava����ʾJava�γ̳ɼ���
��2����Student�������Ĺ��췽����
�ڹ��췽����ͨ���β���ɶԳ�Ա�����ĸ�ֵ������
��3����Student�ķ�����Ա��
getNo���������ѧ�ţ�
getName���������������
getSex����������Ա�
getAge����������䣻
getJava���������Java �γ̳ɼ�
��4��������Student�Ķ��壬�����������Ķ������ÿ��ѧ������Ϣ�����㲢��������ѧ��Java���Գɼ���ƽ��ֵ���Լ����㲢�������Java���Գɼ������ֵ����Сֵ��
 */
//Pragramme name Student;
public class Student {
    String sNO, sName, sSex;
    int sAge, sJava;

    public Student(String XH, String XM, String XB, int NL, int XF) {
        super();
        sNO = XH;
        sName = XM;
        sSex = XB;
        sAge = NL;
        sJava = XF;
    }

    public String getNO() {
        return sNO;
    }

    public String getName() {
        return sName;
    }

    public String getSex() {
        return sSex;
    }

    public int getAge() {
        return sAge;
    }

    public int getJava() {
        return sJava;
    }

    public static void main(String[] args) {
        Student[] st = new Student[5];
        st[0] = new Student("09zc01", "����", "��", 19, 94);
        st[1] = new Student("09zc02", "����", "��", 20, 85);
        st[2] = new Student("09zc03", "����", "Ů", 18, 96);
        st[3] = new Student("09zc04", "����", "��", 17, 90);
        st[4] = new Student("09zc05", "����", "Ů", 21, 88);
        int max = 0, min = 100, sum = 0;
        System.out.println("ѧ����Ϣ��");
        for (int i = 0; i < st.length; i++) {
            if (st[i].sJava < min) {
                min = st[i].sJava;
            }
            if (st[i].sJava > max) {
                max = st[i].sJava;
            }
            sum = sum + st[i].sJava;
            System.out.println("ѧ����ţ�" + st[i].getNO() + "��������" + st[i].getName() + "���Ա�" + st[i].getSex() + "�����䣺" + st[i].getAge() + "��Java��ѧ�֣�" + st[i].getJava());
        }
        System.out.println();
        System.out.println("����ѧ����" + st.length + "��ƽ���ɼ���" + sum / st.length);
        System.out.println("��Сѧ�֣�" + min + "�����ѧ�֣�" + max);
    }
}