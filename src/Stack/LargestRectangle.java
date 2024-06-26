package Stack;

import java.util.List;
import java.util.Stack;

public class LargestRectangle {

    public static void main(String[] args) {

        System.out.println(largestRectangle(List.of(1, 2, 3, 4, 5)));

    }

    public static long largestRectangle(List<Integer> h) {

        Stack<Integer> stack = new Stack<>();
        long maxArea = 0;
        int index = 0;

        while (index < h.size()) {

            if (stack.isEmpty() || h.get(index) >= h.get(stack.peek())) {
                stack.push(index++);
            } else {
                int topOfTheStack = stack.pop();
                long area = (long) h.get(topOfTheStack) * (stack.isEmpty() ? index : index - stack.peek() - 1);
                maxArea = Math.max(maxArea, area);
            }
        }

        while (!stack.isEmpty()) {
            int topOfTheStack = stack.pop();
            long area = (long) h.get(topOfTheStack) * (stack.isEmpty() ? index : index - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

}
