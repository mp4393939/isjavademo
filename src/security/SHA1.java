package security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1 {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        String test = TranslateSHA1("1");
        //System.out.println(test);
    }
    private static String TranslateSHA1(String sourceStr) {
        String result = "NULL";
        try {
            MessageDigest md = MessageDigest.getInstance("SHA1");
            md.update(sourceStr.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < 5; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            result = buf.toString();
            System.out.println("SHA1(" + sourceStr + b.length + "-------------"+result.toLowerCase());
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
        return result;

    }
}