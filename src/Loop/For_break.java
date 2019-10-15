package Loop;

public class For_break {
    public static void main (String[] args){
        for(int i=0;i<3;i++){
            System.out.println("Pass"+i+":");
            for(int j=0;j<100;j++){
                if(j==10)
                    //terminate loop if j is 10
                    break;
                System.out.println(j+" ");
            }
            System.out.println("--------------------------");
        }
        System.out.println("Loops complete");
    }
}
