package day2;
interface get{
    void get(int param);
    int doctorid=000000;
    class test implements get{
        int doctorid=000000;
        public void get(int p){
            System.out.println("取药人数有"+p+"人");
        }
        public int doctor(){
            return doctorid;
        }
    }
}
public class yinyong1 implements get{
    public void get(int p){
    System.out.println("取药人数有"+p+"人");
}
    public static void main(String args[]){
        yinyong1 t=new yinyong1();
        //int doctorid=997227;
        t.get(5);
        System.out.println("new doctorid is"+get.doctorid);
    }
}

