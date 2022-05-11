package calculation;

public class MathDemo {
    public static void main(String args[]) {
        /**
         *Math.sqrt()//����ƽ����
         *Math.cbrt()//����������
         *Math.pow(a, b)//����a��b�η�
         *Math.max( , );//�������ֵ
         *Math.min( , );//������Сֵ
         */
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(Math.sqrt(16));   //4.0
        System.out.println(Math.cbrt(8));    //2.0
        System.out.println(Math.pow(3, 2));     //9.0
        System.out.println(Math.max(2.3, 4.5));//4.5
        System.out.println(Math.min(2.3, 4.5));//2.3
        System.out.println("1-----------------------------------------------------------------------------");

        /**
         * abs�����ֵ
         */
        System.out.println(Math.abs(-10.4));    //10.4
        System.out.println(Math.abs(10.1));     //10.1
        System.out.println("2-----------------------------------------------------------------------------");

        /**
         * ceil�컨�����˼�����Ƿ��ش��ֵ
         */
        System.out.println(Math.ceil(-10.1));   //-10.0
        System.out.println(Math.ceil(10.7));    //11.0
        System.out.println(Math.ceil(-0.7));    //-0.0
        System.out.println(Math.ceil(0.0));     //0.0
        System.out.println(Math.ceil(-0.0));    //-0.0
        System.out.println(Math.ceil(-1.7));    //-1.0
        System.out.println("3-----------------------------------------------------------------------------");

        /**
         * floor�ذ����˼�����Ƿ���С��ֵ
         */
        System.out.println(Math.floor(-10.1));  //-11.0
        System.out.println(Math.floor(10.7));   //10.0
        System.out.println(Math.floor(-0.7));   //-1.0
        System.out.println(Math.floor(0.0));    //0.0
        System.out.println(Math.floor(-0.0));   //-0.0
        System.out.println("4-----------------------------------------------------------------------------");

        /**
         * random ȡ��һ�����ڻ��ߵ���0.0С�ڲ�����1.0�������
         */
        System.out.println(Math.random());  //С��1����0��double���͵���
        System.out.println(Math.random() * 2);//����0С��1��double���͵���
        System.out.println(Math.random() * 2 + 1);//����1С��2��double���͵���
        System.out.println("5-----------------------------------------------------------------------------");

        /**
         * rint �������룬����doubleֵ
         * ע��.5��ʱ���ȡż��    �쳣������=��=
         */
        System.out.println(Math.rint(10.1));    //10.0
        System.out.println(Math.rint(10.7));    //11.0
        System.out.println(Math.rint(11.5));    //12.0
        System.out.println(Math.rint(10.5));    //10.0
        System.out.println(Math.rint(10.51));   //11.0
        System.out.println(Math.rint(-10.5));   //-10.0
        System.out.println(Math.rint(-11.5));   //-12.0
        System.out.println(Math.rint(-10.51));  //-11.0
        System.out.println(Math.rint(-10.6));   //-11.0
        System.out.println(Math.rint(-10.2));   //-10.0
        System.out.println("6-----------------------------------------------------------------------------");

        /**
         * round �������룬floatʱ����intֵ��doubleʱ����longֵ
         */
        System.out.println(Math.round(10.1));   //10
        System.out.println(Math.round(10.7));   //11
        System.out.println(Math.round(10.5));   //11
        System.out.println(Math.round(10.51));  //11
        System.out.println(Math.round(-10.5));  //-10
        System.out.println(Math.round(-10.51)); //-11
        System.out.println(Math.round(-10.6));  //-11
        System.out.println(Math.round(-10.2));  //-10
    }
}
