package Class;

interface callback {
    void callback(int param);

    class test implements callback {
        public void callback(int p) {
            System.out.println("callback called with" + p);
        }
    }
}

public class client implements callback {
    public void callback(int p) {
        System.out.println("callback called with" + p);
    }

    public static void main(String args[]) {
        client t = new client();
        t.callback(5);
    }
}
