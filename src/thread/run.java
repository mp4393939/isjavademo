package thread;
class newthread2 extends Thread{
    newthread2(){
        super("demo thread");
        System.out.println("child thread:"+this);
        start();
    }
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("child thread:"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("child interrupted:");
        }
        System.out.println("child thread exiting");
    }
}
public class run {
    public static void main(String[] args) {
        new newthread2();
        try{
            for(int i=5;i>0;i--){
                System.out.println("main thread:"+i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("main thread interrupted:");
        }
        System.out.println("main thread exiting");
    }
}
