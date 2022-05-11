package loop;
//Java中判断多个int型变量是否互不相等
public class EqualJudge {
    public static void main(String[] args) {
        int[] array1={4,6,10,10,100,88,666};
        System.out.println(isJudge(array1));
        int[] array2={1,2,3,4,5,6,7,8,9,0};
        System.out.println(isJudge(array2));
    }
    public static boolean isJudge(int[] s){
        for(int i=0;i<s.length;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[i]==s[j])
                    return false;
            }
        }
        return true;
    }
}
