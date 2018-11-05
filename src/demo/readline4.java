package demo;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class readline4 {
    public static void main(String args[]) throws IOException{
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        String[] str=new String[4];
        System.out.println("input 'q' to quit");
        for(int i=0;i<str.length;i++){
            str[i]=bu.readLine();
            if(str[i].equals("stop"))
                break;
        }
        System.out.println("this is your input:");
        for(int i=0;i<str.length;i++){
            if(str[i].equals("stop"))
                break;
            System.out.println(str[i]);
        }
    }
}
