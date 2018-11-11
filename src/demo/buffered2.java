package demo;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class buffered2 {
    public static void main(String args[]) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[3];
        System.out.println("if you input 'stop' or 's',program will quit");
        for (int i = 0; i < str.length; i++) {
            str[i] = buff.readLine();
            if (str[i].equals("stop") | str[i].equals("s"))
                break;
        }
        System.out.println("this is your input:");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("stop") | str[i].equals("s"))
                break;
            System.out.println(str[i]);
        }
    }
}
