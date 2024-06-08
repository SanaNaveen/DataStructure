/*
* https://www.hackerrank.com/challenges/crush/problem
* */
package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraysManipulation {

    public static void main(String... args) {

        int n = 10;
        int m = 3;
        long[] result = new long[n+2];
        long max = Long.MIN_VALUE;

        List<List<Integer>> queries = new ArrayList<>();
        queries.add(List.of(1,5,3));
        queries.add(List.of(4,8,7));
        queries.add(List.of(6,9,1));

        for (int i = 0; i < queries.size(); i++) {

            int a = queries.get(i).get(0);
            int b = queries.get(i).get(1);
            int k = queries.get(i).get(2);

            result[a-1] += k;

            result[b] -= k;
        }

        long current = 0;

        for (int i = 1; i <= n; i++) {
            current += result[i];
            if (current > max) {
                max = current;
            }
        }

        System.out.println(max);



    }

}
