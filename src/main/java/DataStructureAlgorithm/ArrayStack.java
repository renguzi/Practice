package DataStructureAlgorithm;

/**
 * @Author:asher
 * @Date:2020/8/11 10:00
 * @Description:DataStructureAlgorithm
 * @Version:1.0
 */
public class ArrayStack {
    private String[] items;  //数组
    private int count;    //栈中元素个数
    private int n;          //栈的大小

    //初始化栈，用构造函数。栈的大小=数组大小。初始化时，栈中元素为0个。
    public ArrayStack(int n) {
        this.items = new String[n];  //
        this.n = n;
        this.count = 0;
    }

    //入栈操作
    public boolean pushStack(String x) {
        //栈没有空间了，即，栈中元素个数等于数组大小，数组写满了。
        if (count == n) {
            return false;
        } else {
            items[count] = x;
            count++;
            return true;
        }
    }

    //出栈操作
    public String popStack() {
        if (count == 0) {
            return null;
        } else {
            String temp = items[count-1];
            count--;
            return temp;
        }
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(4);
        System.out.println(arrayStack.pushStack("a"));
        System.out.println(arrayStack.pushStack("b"));
        System.out.println(arrayStack.pushStack("c"));
        System.out.println(arrayStack.pushStack("d"));
        System.out.println(arrayStack.pushStack("f"));
        System.out.println(arrayStack.pushStack("z"));

        System.out.println(arrayStack.popStack());
        System.out.println(arrayStack.popStack());
        System.out.println(arrayStack.popStack());
        System.out.println(arrayStack.popStack());
        System.out.println(arrayStack.popStack());

    }
}
