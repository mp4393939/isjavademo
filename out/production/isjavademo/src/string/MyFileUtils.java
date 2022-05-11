package string;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 10  * @Auther:gongxingrui
 * 11  * @Date:2018-05-10
 * 12  * @Description: �޸��ļ����ݣ��ַ��������滻
 * 13
 **/
public class MyFileUtils {
    /**
     * 16      * �޸��ļ����ݣ��ַ��������滻
     * 17      *
     * 18      * @param file����������ļ�
     * 19      * @param oldstr����Ҫ�滻�ľ��ַ���
     * 20      * @param newStr�������滻�����ַ���
     * 21
     */
    public boolean modifyFileContent(File file, String oldstr, String newStr) {
        List<String> list = null;
        try {
            list = FileUtils.readLines(file, "UTF-8");
            for (int i = 0; i < list.size(); i++) {
                String temp = list.get(i).replaceAll(oldstr, newStr);
                list.remove(i);
                list.add(i, temp);
            }
            FileUtils.writeLines(file, "UTF-8", list, false);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public boolean modifyFileContent(String filePath, String oldstr, String newStr) {
        return modifyFileContent(new File(filePath), oldstr, newStr);
    }

}