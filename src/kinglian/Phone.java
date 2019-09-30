package kinglian;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Phone {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = null;
        PrintStream p = null;
        try {
            // new path
            FileOutputStream f = new FileOutputStream(new File("E:\\phone.txt"));
            f.close();
            fout = new FileOutputStream("E:\\phone.txt", true);
            p = new PrintStream(fout);
            for (long i = 13500000000l; i <= 13500000100l; i++) {
                p.println(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (p != null) {
            p.close();
        }
        System.out.println("The phone number has been written to the text.");
    }
}
