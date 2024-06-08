package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Array2DDS {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(-1, 1, -1, 0, 0, 0));
        list.add(List.of(0, -1, 0, 0, 0, 0));
        list.add(List.of(-1, -1, -1, 0, 0, 0));
        list.add(List.of(-0, -9, 2, -4, -4, 0));
        list.add(List.of(-7, 0, 0, -2, 0, 0));
        list.add(List.of(0, 0, -1, -2, -4, 0));
        System.out.println(hourglassSum(list));
    }

    public static int hourglassSum(List<List<Integer>> arr) {

        List<Integer> sumOfArray = new ArrayList<>();


        int row = arr.size();
        int col = arr.get(0).size();

        for (int i = 0; i < row - 2; i++) {

            for (int j = 0; j < col - 2; j++) {

                int sum = singleHourGlassSum(arr, i, j);

                sumOfArray.add(sum);
            }

        }

        return sumOfArray.stream().max(Integer::compare).get();

    }

    private static int singleHourGlassSum(List<List<Integer>> arr, int i, int j) {
        return arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                + arr.get(i + 1).get(j + 1) +
                arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
    }
}
