package IdCardGenerator;

import java.io.*;

public class List {
    public static void main(String[] args) {
        String[] stringArgs = new String[50];
        //��ȡ���·�����ı�����srcĿ¼��ʼ��ע��ʹ�á�/��
        File file = new File("src/IdCardGenerator/ip.txt");
        FileReader fr;
        String str = null;
        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            int i = 0;
            while ((str = br.readLine()) != null) {
                str = str.trim();
                if (-1 != (str.lastIndexOf("ms"))) {
                    stringArgs[i] = str.substring(str.lastIndexOf("ms") + 2);
                    i++;
                    System.out.println(stringArgs[i - 1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
