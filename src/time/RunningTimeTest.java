package time;

public class RunningTimeTest {
    public static void main(String[] args) {
        StringTest(10000);
        StringbuildTest(10000);
        StringBuffTest(10000);
    }
    public static void StringTest(int number){
        String str="";
        long startTime = System.currentTimeMillis();    //获取开始时间
        for(int i=1;i<=number;i++){
            str=str+i;
        }
        long endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println(endTime-startTime+"ms");
    }
    public static void StringbuildTest(int number){
        StringBuilder build=new StringBuilder("");
        long startTime = System.currentTimeMillis();    //获取开始时间
        for(int i=1;i<=number;i++){
            build.append(i);
        }
        long endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println(endTime-startTime+"ms");
    }
    public static void StringBuffTest(int number){
        StringBuffer buff=new StringBuffer("");
        long startTime = System.currentTimeMillis();    //获取开始时间
        for(int i=1;i<=number;i++){
            buff.append(i);
        }
        long endTime = System.currentTimeMillis();    //获取结束时间
        System.out.println(endTime-startTime+"ms");
    }
}
