package demo;
class newthread4 implements Runnable{
    @Override
    public String toString() {
        return super.toString();
    }
    Thread t;
    public newthread4(){
        t=new Thread(this,"demo thread");
        System.out.println("child thread info:"+t);
        t.start();
    }
    public void run(){
        try{
            for(int i=6;i>0;i--){
                System.out.println("child thread:"+i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("child thread interrupted");
        }
        System.out.println("child thread exiting");
    }
}
public class thread4 {
    public static void main(String[] args) {
        new newthread4();
        try{
            for(int i=5;i>0;i--){
                System.out.println("main thread:"+i);
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){
            System.out.println("main thread interrupted");
        }
        System.out.println("main thread exiting");
        newthread4 t=new newthread4();
        System.out.println(t.toString());
   }
}
