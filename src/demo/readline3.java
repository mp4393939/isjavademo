package demo;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class readline3 {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       // String[] str=new String[5];
        String str[]={"1","2","3","4","5"};
        System.out.println("read 'q' to quit");
        for(int i=0;i<str.length;i++){
            str[i]=br.readLine();
            if(str[i].equals("stop"))
                break;
        }
        System.out.println("Your input is");
       for(int i=0;i<5;i++){
            if(str[i].equals(null))
                break;
            System.out.println(str[i]);
       }
    }
}
