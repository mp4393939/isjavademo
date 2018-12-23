import java.io.BufferedReader;

public class testdemo {
    public String byteArrayToStr(byte[] byteArray) {
        if (byteArray == null) {
            return null;
        }
        String str = new String(byteArray);
        return str;
    }

    public static void main(String[] args) {
        testdemo test = new testdemo();
        BufferedReader reader=null;
        byte b[]={};

    }
}


