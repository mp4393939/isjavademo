package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class read_q {
    public static void main(String args[]) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter characters,'q' is quit.");//遇到q后中停止读取
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
