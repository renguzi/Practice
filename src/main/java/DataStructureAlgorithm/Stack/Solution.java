package DataStructureAlgorithm.Stack;

import java.util.Stack;

/**
 * @Author:asher
 * @Date:2021/2/23 21:45
 * @Description:DataStructureAlgorithm.Stack
 * @Version:1.0
 */
public class Solution {

    public boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
//        System.out.println(characterStack);
        char[] chars = s.toCharArray();
//        System.out.println(chars);
//        System.out.println("  0000000000000000000");
//        for (int i = 0; i < s.length(); i++) {
//            char temp = s.charAt(i);
//            if (temp == '[' || temp == '{' || temp == '(') {
//                characterStack.push(temp);
//            }
//            if (temp == ']' && characterStack.peek() == '[') {
//                characterStack.pop();
//            }
//            if (temp == '}' && characterStack.peek() == '{') {
//                characterStack.pop();
//            }
//            if (temp == ')' && characterStack.peek() == '(') {
//                characterStack.pop();
//            }
//        }
//        System.out.println(characterStack);

        for (int i = 0; i < chars.length; i++) {
//            System.out.println("char[" + i + "]== " + chars[i]);
            if (chars[i] == '[' || chars[i] == '(' || chars[i] == '{') {
                characterStack.push(chars[i]);
            } else{
                if (characterStack.isEmpty()|| chars[i]!=characterStack.pop()) {
                    return false;
                }
//                char c=characterStack.pop();
//                if (chars[i] == ']' && c != '[') {
//                    return false;
//                }
//                if (chars[i] == '}' && c != '{') {
//                    return false;
//                }
//                if (chars[i] == ')' && c != '(') {
//                    return false;
//                }
            }


//            System.out.println(characterStack);
//                if (chars[i] == ']' && characterStack.peek() == '[') {
//                    characterStack.pop();
//                }
//            if (chars[i] == ')' && characterStack.peek() == '(') {
//                characterStack.pop();
//            }
//            if (chars[i] == '}' && characterStack.peek() == '{') {
//                characterStack.pop();
//            }
        }
        return characterStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println((new Solution()).isValid("[{}]()"));
        System.out.println((new Solution()).isValid("){}[]"));

        Stack stack=new Stack();
        System.out.println("1111");
        System.out.println(stack.peek());
        System.out.println("222");
        System.out.println(stack.pop());

    }
}
