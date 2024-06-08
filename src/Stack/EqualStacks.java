/*
 * https://www.hackerrank.com/challenges/equal-stacks/problem?isFullScreen=false
 * */
package Stack;

import java.util.*;

public class EqualStacks {

    public static void main(String[] args) {

        List<Integer> h1 = List.of(1);
        List<Integer> h2 = List.of(1);
        List<Integer> h3 = List.of(1);

        int h1Sum = sum(h1);
        int h2Sum = sum(h2);
        int h3Sum = sum(h3);

        if (h1Sum == h2Sum && h1Sum == h3Sum) {
            System.out.println(h1Sum);
            return;
        }

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        listToStack(h1, stack1);
        listToStack(h2, stack2);
        listToStack(h3, stack3);

        while (true) {

            if (stack1.isEmpty() && stack2.isEmpty() && stack3.isEmpty()) {
                System.out.println("0");
                return;
            }

            int maxHight = Math.max(h1Sum, Math.max(h2Sum, h3Sum));


            if (h1Sum == maxHight) {
                h1Sum -= stack1.pop();
            } else if (h2Sum == maxHight) {
                h2Sum -= stack2.pop();
            } else if (h3Sum == maxHight) {
                h3Sum -= stack3.pop();
            }



        }

    }

    static void listToStack(List<Integer> lists, Stack<Integer> stack) {

        for (int i = lists.size() - 1; i >= 0; i--) {
            stack.push(lists.get(i));
        }

    }

    static int sum(List<Integer> list) {
        return list.stream().mapToInt(i -> i).sum();
    }

}
