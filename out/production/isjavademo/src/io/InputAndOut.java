package io;

import java.io.*;
import java.util.Scanner;

public class InputAndOut {
    public static void main(String[] args) {
        ScannerInputAndOut();
        ByteInputAndOut();
        CharInputAndOut();
    }

    //����̨���
    public static void ScannerInputAndOut() {
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextLine());
    }

    /**
     * �ֽ���
     */
    public static void ByteInputAndOut() {
        //����
        BufferedInputStream in = new BufferedInputStream(System.in);
        try {
            byte[] b = new byte[1024];
            in.read(b);
            System.out.println(new String(b));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //���
        BufferedOutputStream out = new BufferedOutputStream(System.out);
        try {
            for (int i = 0; i < 5; i++) {
                out.write("hello".getBytes());
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * �ַ���
     */
    public static void CharInputAndOut() {
        //����
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //���
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            for (int i = 0; i < 5; i++) {
                out.write("hello" + i);
                out.newLine();
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
