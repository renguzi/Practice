package ThinkingInJavaPractice.HoldingYourObjects;

/**
 * @Author:asher
 * @Date:2021/2/3 21:50
 * @Description:ThinkingInJavaPractice.HoldingYourObjects
 * @Version:1.0
 */
public class StackCollision {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "my dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }

        java.util.Stack<String> stack1 = new java.util.Stack<>();
        for (String s : "my dog has fleas".split(" ")) {
            stack1.push(s);
        }
        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }
    }
}
