package algorithms.quick;

import java.util.Arrays;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[][] data = {
                {},
                {1},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            int low = 0;
            int high = arr.length - 1;
            Quick.sort(arr, low, high);
            System.out.println(Arrays.toString(arr));
        }
    }
}
