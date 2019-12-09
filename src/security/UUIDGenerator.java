package security;

import java.util.UUID;

public class UUIDGenerator {

    /**
     * ?
     * ? ? ?* ���һ��UUID?
     * ? ? ?* @return string UUID?
     * ? ? ?
     */
    public static String getUUID() {
        String s = UUID.randomUUID().toString();
        //ȥ����-������?
        // return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
        //��ȥ����-������
        return s;
    }

    /**
     * ?
     * ? ? ?* ���ָ����Ŀ��UUID?
     * ? ? ?* @param number int ��Ҫ��õ�UUID����?
     * ? ? ?* @return string[] UUID����?
     * ? ? ?
     */
    public static String[] getUUID(int number) {
        if (number < 1) {
            return null;
        }
        String[] ss = new String[number];
        for (int i = 0; i < number; i++) {
            ss[i] = getUUID();
        }
        return ss;
    }

    public static void main(String[] args) {
        String[] ss = getUUID(10);
        //for (int i = 0; i < ss.length; i++) {
        for (String s : ss) {
            System.out.println(s);
        }
    }
}


