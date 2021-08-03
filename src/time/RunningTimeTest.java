package time;
//1000 毫秒 = 1秒 1,000,000 微秒 = 1秒 1,000,000,000 纳秒 = 1秒
public class RunningTimeTest {
    public static void main(String[] args) {
        StringTest(10000);
        StringbuildTest(10000);
        StringBuffTest(10000);
    }
    public static void StringTest(int number){
        String str="";
        long startTime = System.currentTimeMillis();    //获取开始时间
        long startTime2=System.nanoTime();
        for(int i=1;i<=number;i++){
            str=str+i;
        }
        long endTime = System.currentTimeMillis();    //获取结束时间
        long endTime2=System.nanoTime();
        System.out.println("String："+(endTime-startTime)+"ms");
        System.out.println("String："+(endTime2-startTime2)+"ns");
    }
    public static void StringbuildTest(int number){
        StringBuilder build=new StringBuilder("");
        long startTime = System.currentTimeMillis();    //获取开始时间
        long startTime2=System.nanoTime();
        for(int i=1;i<=number;i++){
            build.append(i);
        }
        long endTime = System.currentTimeMillis();    //获取结束时间
        long endTime2=System.nanoTime();
        System.out.println("StringBuilder："+(endTime-startTime)+"ms");
        System.out.println("String："+(endTime2-startTime2)+"ns");
    }
    public static void StringBuffTest(int number){
        StringBuffer buff=new StringBuffer("");
        long startTime = System.currentTimeMillis();    //获取开始时间
        long startTime2=System.nanoTime();
        for(int i=1;i<=number;i++){
            buff.append(i);
        }
        long endTime = System.currentTimeMillis();    //获取结束时间
        long endTime2=System.nanoTime();
        System.out.println("StringBuffer："+(endTime-startTime)+"ms");
        System.out.println("String："+(endTime2-startTime2)+"ns");
    }
}
