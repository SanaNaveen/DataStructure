package Stack;

import java.util.List;


public class GameOfTwoStacks {

    public static void main(String[] args) {

        int result = twoStacks(10, List.of(4, 2, 4, 6, 1), List.of(2, 1, 8, 5));

        System.out.println(result);

    }

    static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {


        int lengthB = 0, sum = 0;

        while (lengthB < b.size() && (sum + b.get(lengthB) <= maxSum)) {
            sum += b.get(lengthB);
            lengthB++;
        }

        int maxScore = lengthB;

        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            while (sum > maxSum && lengthB > 0) {
                lengthB--;
                sum -= b.get(lengthB);
            }
            if (sum > maxSum) {
                break;
            }
            maxScore = Math.max(maxScore, lengthB + i + 1);
        }


        return maxScore;

    }
}
