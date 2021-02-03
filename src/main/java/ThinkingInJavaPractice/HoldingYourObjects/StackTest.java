package ThinkingInJavaPractice.HoldingYourObjects;

/**
 * @Author:asher
 * @Date:2021/2/3 21:35
 * @Description:ThinkingInJavaPractice.HoldingYourObjects
 * @Version:1.0
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
