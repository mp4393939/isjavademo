package IdCardGenerator;

public class zuoyongyu {
    public static void main (String args[]){
        int i=10;
        if(i>2){
            int j=10;
            i = i--;
            while(i<=5) {
                int result =i+1;
                System.out.println("j=" + j);
                System.out.println("result=" + i);
            }
        }
        //j在作用域外使用会报错
        System.out.println('\n'+"i="+i);
    }
}
