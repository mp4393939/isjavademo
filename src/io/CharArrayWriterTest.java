package io;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriterTest {

    @SuppressWarnings("unused")
    private static final int LEN = 5;
    // ��ӦӢ����ĸ��abcdefghijklmnopqrstuvwxyz��
    private static final char[] ArrayLetters = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

    public static void main(String[] args) {

        tesCharArrayWriter();
    }

    /**
     * CharArrayWriter��API���Ժ���
     */
    private static void tesCharArrayWriter() {
        try {
            // ����CharArrayWriter�ַ���
            CharArrayWriter caw = new CharArrayWriter();

            // д�롰A�����ַ�
            caw.write('A');
            // д���ַ�����BC�����ַ�
            caw.write("BC");
            // System.out.printf("caw=%s\n", caw);
            // ��ArrayLetters�����дӡ�3����ʼ�ĺ�5���ַ�(defgh)д�뵽caw�С�
            caw.write(ArrayLetters, 3, 5);
            // System.out.printf("caw=%s\n", caw);

            // (01) д���ַ�0
            // (02) Ȼ�����д�롰123456789��
            // (03) �ٽ���д��ArrayLetters�е�8-12���ַ�(ijkl)
            caw.append('0').append("123456789").append(String.valueOf(ArrayLetters), 8, 12);

            System.out.printf("caw=%s\n", caw);

            // ���㳤��
            int size = caw.size();
            System.out.printf("size=%s\n", size);

            // ת����byte[]����
            char[] buf = caw.toCharArray();
            System.out.printf("buf=%s\n", String.valueOf(buf));

            // ��cawд�뵽��һ���������
            CharArrayWriter caw2 = new CharArrayWriter();
            caw.writeTo(caw2);
            System.out.printf("caw2=%s\n", caw2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}