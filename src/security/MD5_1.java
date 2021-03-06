package security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
CreateTime:2018/12/11
Author:zhenghh
从代码读取要加密的字符串
 */
public class MD5_1 {


    public static void main(String[] args) {
        @SuppressWarnings("unused")
        String test = TranslateMD5("u1_1679BED9-4957-4396-9C67-32A31FADDEA8");
    }

    private static String TranslateMD5(String sourceStr) {
        String result = "NULL";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sourceStr.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
            result = buf.toString();
            sourceStr = sourceStr.toLowerCase();
            System.out.println("MD5(" + sourceStr + ",32 小写) = " + result.toLowerCase());
            System.out.println("MD5(" + sourceStr + ",32 大写) = " + result.toUpperCase());
            System.out.println("MD5(" + sourceStr + ",16 小写) = " + buf.toString().substring(8, 24).toLowerCase());
            System.out.println("MD5(" + sourceStr + ",16 大写) = " + buf.toString().substring(8, 24).toUpperCase());
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
        return result;

    }
}