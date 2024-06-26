/*
* https://www.hackerrank.com/challenges/simple-text-editor/problem?isFullScreen=false
* */
package Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter the No");
//        int no = scan.nextInt();

        ArrayList<String> operations = new ArrayList<>();

//        for (int i=0;i<no;i++) {
//            System.out.println("Enter the operation");
//            operations.add(scan.nextLine());
//        }


        operations.add("1 fg");
        operations.add("3 6");
        operations.add("2 5");
        operations.add("4");
        operations.add("3 7");
        operations.add("4");
        operations.add("3 4");

        String s = new String("abcde");
        Stack<String> stack = new Stack<>();
        stack.push(s);

        for (String operation : operations) {

            String[] value = operation.split(" ");
            int type = Integer.parseInt(value[0]);

            switch (type) {
                case 1 -> {
                    s = s + value[1];
                    stack.push(s);
                }

                case 2 -> {
                    s = s.substring(0, s.length()-Integer.parseInt(value[1]));
                    stack.push(s);
                }

                case 3 -> {
                    int k = Integer.parseInt(value[1]);
                    System.out.println(s.charAt(k-1));
                }

                case 4 -> {
                    stack.pop();
                    s = stack.peek();
                }
            }

        }


    }

}
