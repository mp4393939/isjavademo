package io;

import java.io.*;

public class IdCardOutputDisk {
    public static void main(String[] args) throws IOException {
        //��ȡ�ַ���
        // FileReader fr = new FileReader("E:\\jmeter\\IdCard.txt");
        //д���ַ���
        //FileWriter fw = new FileWriter("E:\\jmeter\\Birthday.txt");
/*
���ַ���������ȡ�ı��������ַ������ṩ�ַ���������еĸ�Ч��ȡ������ָ����������С�����߿���ʹ��Ĭ�ϴ�С�� Ĭ��ֵ�㹻�󣬿����ڴ������;��
ͨ�����ɶ�ȡ��������ÿ����ȡ��������Եײ��ַ����ֽ�������Ӧ��ȡ���� ��ˣ����齫BufferedReader��װ����read�����������ܰ���Ķ�ȡ���ϣ�����FileReaders��
InputStreamReaders
 */
        BufferedReader brfr = new BufferedReader(new FileReader("E:\\jmeter\\IdCard.txt"));
/*
���ı�д���ַ�������������ַ������ṩ�����ַ���������ַ����ĸ�Чд�롣����ָ����������С�����߿��Խ���Ĭ�ϴ�С�� Ĭ��ֵ�㹻�󣬿����ڴ������;��
�ṩ��һ��newLine������������ʹ��ƽ̨�Լ���ϵͳ����line.separator������зָ������ ��������ƽ̨��ʹ�û��з���'\ n'������ֹ�С� ��ˣ����ô˷�������ֹÿ������У�
�����ѡֱ��д�뻻�з���
һ����˵��Writer��������������͵��ײ��ַ����ֽ����� ������Ҫ��ʾ����������齫BufferedWriter��װ����write�����������ܺܰ����Writer�ϣ�����FileWriters��
OutputStreamWriters��
 */
        BufferedWriter bwfw = new BufferedWriter(new FileWriter("E:\\jmeter\\Birthday.txt"));
        //һ��һ��д
        String txt;
        //readLine()������ȡ���ַ���Ϊnullʱ
        while ((txt = brfr.readLine()) != null) {
            //System.out.println(txt.substring(6,10)+","+txt.substring(10,12)+","+txt.substring(12,14));
            String Year = txt.substring(6, 10);
            String Month = txt.substring(10, 12);
            String Day = txt.substring(12, 14);
            String Birthday = Year + "," + Month + "," + Day;
            //дһ���ַ���
            bwfw.write(Birthday);
            //дһ���зָ���
            bwfw.newLine();
            //ˢ����
            bwfw.flush();
        }
        //�ر���
        brfr.close();
        bwfw.close();
        System.out.println("�����֤�����ȡ��������д�����");
    }
}
