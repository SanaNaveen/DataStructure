/*
 ** Left Rotation - https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true
 */
package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LeftRotation {


    public static void main(String[] args) {
        int d = 2;

        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};

        List<Integer> numberList = Arrays.asList(arr);

        List<Integer> roatedList = new ArrayList<>();

        for (int i = d; i < numberList.size(); i++) {
            roatedList.add(numberList.get(i));
        }

        for (int i = 0; i < d; i++) {
            roatedList.add(numberList.get(i));
        }

        System.out.println(roatedList);

        LinkedList<Integer> queue = new LinkedList<>(numberList);
        for (int i=0; i<d; i++) {
            queue.addLast(queue.pop());
        }

        System.out.println(queue);

    }

}
