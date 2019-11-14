package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

//链表类ArrayList是最流行的java数据结构之一，链表实现了可缩放数组，比数组更灵活，链表根据需要改变长度，所以他必须根据元素的增加和删除决定缩放多少
public class CodeKeeper {
    ArrayList list;
    String[] codes = {"alpha", "lambda", "gamma", "delta", "zeta"};

    public CodeKeeper(String[] userCodes) {
        list = new ArrayList();
        //load built-in codes
        for (int i = 0; i < codes.length; i++) {
            addCode(codes[i]);
        }
        //load user codes
        for (int j = 0; j < userCodes.length; j++) {
            addCode(userCodes[j]);
        }
        //display all codes
        for (Iterator ite = list.iterator(); ite.hasNext(); ) {
            String output = (String) ite.next();
            System.out.println(output);
        }
    }

    private void addCode(String code) {
        if (!list.contains(code)) {
            list.add(code);
        }
    }

    public static void main(String[] arguments) {
        CodeKeeper keeper = new CodeKeeper(arguments);
        System.out.println(keeper.codes.length);
    }
    /*public static void main(String[] args) {
        CodeKeeper keeper=new CodeKeeper(args);

    }*/
}
