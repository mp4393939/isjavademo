package IdCardGenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class IdCard_substring {
    public static void main(String[] args){
        File file=new File("E:\\jmeter\\IdCard.txt");
        BufferedReader reader=null;
        String txt=null;
        int line=1;
        try {
            reader = new BufferedReader(new FileReader(file));
            System.out.println("将身份证的出生年月日取出，如下：");
            while ((txt = reader.readLine()) != null) {
                line++;
                System.out.println(txt.toString().substring(6,10)+","+txt.toString().substring(10,12)+","+txt.toString().substring(12,14));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            if(reader!=null){
                try{reader.close();}
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
        }
    }

