package IdCardGenerator;

public class logic1 {
    public static void main (String[] args){
        int x=0,result=0;double y=1;
        while(x<4){
            result+=x;
            x++;
            y=result-0.01;
        }
        System.out.println(x+"\n"+result+"\n"+y);
       for(int i=10;i>1;i--){
           int j=0;
           j+=i;
           x=i;
           y=j;
       }
       System.out.println(x+"\n"+y);
    }
}
