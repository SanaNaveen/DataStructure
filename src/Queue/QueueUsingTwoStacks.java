/*
 * https://www.hackerrank.com/challenges/queue-using-two-stacks/problem?isFullScreen=false
 * */
package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueUsingTwoStacks {

    public static void main(String[] args) {

        Queue<Integer> noOfQueue = new LinkedList<>();

        int[] data = {1, 2, 1, 3, 1, 3, 1, 1, 2, 2};

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < data.length; i++) {

            int no = data[i];
            switch (no) {
                case 1 -> {
                    System.out.println("Enter the number");
                    noOfQueue.add(scan.nextInt());
                }
                case 2 -> {
                    System.out.println("Remove the Number ->" + noOfQueue.peek());
                    noOfQueue.poll();
                }
                case 3 -> {
                    System.out.println(noOfQueue.peek());
                }
                default -> {
                    System.out.println("No Data");
                }
            }

        }

        System.out.println("Final Answer" + noOfQueue);

    }

}
