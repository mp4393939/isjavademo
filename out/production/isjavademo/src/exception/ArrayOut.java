package exception;

//����Խ���쳣
public class ArrayOut {

    public static void main(String[] args) {
        //����ķ��ʣ�ͨ���±��0��ʼ
        int[] arr = new int[4];
        try {
            //��arr�еĵ�1������ֵΪ55
            arr[0] = 55;
            arr[1] = 66;
            arr[2] = 77;
            arr[3] = 88;
            //��������Խ��
            arr[4] = 99;
        } catch (ArrayIndexOutOfBoundsException e) {
            //e.printStackTrace();
            System.out.println("�˴������쳣������Խ��");
        } finally {
            System.out.println("�Զ����쳣");
        }

    }

}
