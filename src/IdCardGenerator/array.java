package IdCardGenerator;

public class array {
    public static void main (String[] args){
        int array[]={1,2,3,4,5,6,7,8,9,10};
        int x=0,y=0;
        array.toString();
        for(int i=0;i<array.length;i++){
            x=i;
            System.out.print("\t"+array[i]);
            }
        for(int j=array.length-1;j>=0;j--){
            y=j;
            System.out.print("\t"+array[j]);
        }
        System.out.println("\n"+"�������������x��ֵ:"+array[x]);
        System.out.println("x="+x);
        System.out.println("�������������y��ֵ:"+array[y]);
        System.out.println("y="+y);
    }
}
