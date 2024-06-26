/**
 * https://www.hackerrank.com/challenges/balanced-brackets/problem?isFullScreen=false
 */

package Stack;

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {

        System.out.println(isBalanced("{[([)]}"));

    }

    static String isBalanced(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) {
                    return "NO";
                }
                char top = stack.pop();
                if (c == '}' && top != '{' || c == ']' && top != '[' || c == ')' && top != '(') {
                    return "NO";
                }
            }

        }


        return stack.isEmpty() ? "YES" : "NO";

    }

}
