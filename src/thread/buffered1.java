package Thread;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class buffered1 {
    public static void main(String args[]) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[5];
        System.out.println("input 'stop' to quit");
        for (int i = 0; i < str.length; i++) {
            str[i] = buff.readLine();
            if (str.equals("stop"))
                break;
        }
        System.out.println("this is your input:");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("stop"))
                break;
            System.out.println(str[i]);
        }
    }
}
