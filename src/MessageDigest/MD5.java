package MessageDigest;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

class Translate {
    @SuppressWarnings("unused")
    String TranslateMD5(String sourceStr) {
        String result = "NULL";
        try {
            //MD5����
            MessageDigest md = MessageDigest.getInstance("MD5");
            //SHA����
            //MessageDigest md = MessageDigest.getInstance("SHA");
            md.update(sourceStr.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            result = buf.toString();
            //ʹ��16λ��д���ַ���MD5����
            System.out.println(sourceStr + "," + buf.toString().substring(8, 24).toUpperCase());
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
        return result;

    }
}
    public  class MD5 {
        public static void main(String[] args) {
            //�뱾���ļ�����ͨ��
            File file = new File("E:\\demo\\Sum_PersonId.txt");
            BufferedReader reader = null;
            String txt = null;
            @SuppressWarnings("unused")
            int line = 1;
            try {
                reader = new BufferedReader(new FileReader(file));
                while ((txt = reader.readLine()) != null) {
                    //��������ı�
                    //System.out.println(txt);
                    line++;
                    //����TranslateMD5()����
                    Translate test = new Translate();
                    test.TranslateMD5("u1_" + txt.toString().toLowerCase());
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