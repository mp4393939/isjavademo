package security;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
CreateTime:2018/12/11
Author:zhenghh
从磁盘文件读取要加密的字符串
 */
public class MD5_2 {
    public static void main(String[] args) {
        //与本地文件建立通信
        File file = new File("src\\security\\Sum_PersonId.txt");
        BufferedReader reader = null;
        String txt = null;
        @SuppressWarnings("unused")
        int line = 1;
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((txt = reader.readLine()) != null) {
                line++;
                //调用TranslateMD5()方法
                new Translate().TranslateMD5(txt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Translate {
    @SuppressWarnings("unused")
    String TranslateMD5(String sourceStr) {
        String result = "NULL";
        try {
            //MD5加密
            MessageDigest md = MessageDigest.getInstance("MD5");
            //SHA加密
            //MessageDigest md = MessageDigest.getInstance("SHA");
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
