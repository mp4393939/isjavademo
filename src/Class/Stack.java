package Class;

/***
 This class defines an integer stack that can hold 10 values
 push 推动(人或物);移动(身体部位);推进(道路);挤开;推动;此处引申为入栈
 pop (使)发砰砰声;(使)爆裂，发爆裂声;(突然或匆匆)去;此处引申为出栈
 stack 堆栈
 ***/
class Stack {
    private int[] stck = new int[10];
    private int tos;

    //Initialize top-of-stack
    Stack() {
        tos = -1;
    }

    //Push an item onto the stack
    void push(int item) {
        if (tos == 9)
            System.out.println("Stack is full");
        else
            stck[++tos] = item;
    }

    //Pop an item from the stack
    int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow");
            return 0;
        } else
            return stck[tos--];
    }
}
