package dataStructure;

/**
 * @className:Stack
 * @description:栈的讲解
 * @author: renhai
 * @create: 2021-09-23 19:16
 */
public class Stack {
    public static void main(String[] args) {
        ArrayStack arrayStack1 = new ArrayStack(5);
        arrayStack1.push(1);
        arrayStack1.push(2);
        arrayStack1.push(3);
        arrayStack1.push(4);
        //arrayStack1.push(5);
        arrayStack1.showStack();
        arrayStack1.pop();
        arrayStack1.showStack();

    }
}

class ArrayStack {
    private int maxSize;
    private int top = -1;
    private int[] stack;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize - 1];
    }

    //栈满
    public boolean isFull() {
        if (top == maxSize - 1) {
            return true;
        }
        return false;
    }

    //栈空
    public boolean isEmpty() {
        return top == -1;
    }

    //入栈-push
    public void push(int value) {
        if (isFull())
        {
            System.out.println("栈满");
            return;
        }else
        {
            top++;
            stack[top]=value;
        }
    }
    //出栈pop
    public int pop()
    {
        int value;
        if(isEmpty()) {
            //抛出异常
            throw new RuntimeException("栈空，没有数据~");
        }else
        {
            value=stack[top];
            top--;
        }
        return value;
    }
    //显示栈的情况[遍历栈]， 遍历时，需要从栈顶开始显示数据
    public void showStack()
    {
        if (isEmpty())
        {
            System.out.println("栈空");
        }else
        {
            for (int i=top;i>=0;i--)
            {
                System.out.printf("stack[%d]=%d\n", i, stack[i]);
            }
        }
    }
}
