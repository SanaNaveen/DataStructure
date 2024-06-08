/*
* https://www.hackerrank.com/challenges/maximum-element/problem?isFullScreen=false
* */
package Stack;

import java.util.*;

public class MaximumElement {

    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        List<String> operations  = List.of("1 97", "2","1 20","2","1 26","1 20", "2", "3","1 91","3");

        for (String operation : operations) {

            int ope = Integer.parseInt(operation.split(" ")[0]);



            switch (ope) {
                case 1 -> {
                    Integer data = Integer.parseInt(operation.split(" ")[1]);
                    stack.push(data);
                }
                case 2 -> {
                    if (!stack.isEmpty())
                        stack.pop();
                }
                case 3 -> {
                    Integer value = stack.stream().mapToInt(val -> val).max().getAsInt();
                    result.add(value);
                }
            }
        }

        System.out.println(result.toString());


    }

}
