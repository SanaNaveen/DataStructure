/*
 ** sparse-arrays - https://www.hackerrank.com/challenges/sparse-arrays/problem?isFullScreen=true
 */
package Arrays;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {

    public static void main(String[] args) {

        System.out.println(matchingStrings(List.of("ab", "ab", "abc"), List.of("ab", "abc", "bc")));

    }

    static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {

        List<Integer> matchingCount = new ArrayList<>();

        for (String query : queries) {

            int count = 0;

            for (String list : stringList) {

                if (list.equals(query))
                    count++;

            }

            matchingCount.add(count);

        }

        return matchingCount;

    }

}
