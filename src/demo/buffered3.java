package demo;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class buffered3 {
    public static void main(String args[]) throws IOException {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[6];
        System.out.println("Input 'stop' to quit");
        for (int i = 0; i < str.length; i++) {
            str[i] = bu.readLine();
            if (str[i].equals("stop"))
                break;
        }
        System.out.println("This is your input:");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("stop"))
                break;
            System.out.println(str[i]);
        }
    }
}
