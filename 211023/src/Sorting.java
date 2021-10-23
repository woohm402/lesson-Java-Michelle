// assume that sorting == sort array in ascending order

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        // test 1
        // expected: [1, 3]
        System.out.println("-----test1-----");
        System.out.println(Arrays.toString(sort2Array(new int[]{3, 1})));
        // test 2
        // expected: [1, 2, 3, 4, 5]
        System.out.println("-----test2-----");
        System.out.println(Arrays.toString(bubbleSort(new int[]{3, 1, 2, 5, 4})));
    }

    // sort array of size=2 and return
    static int[] sort2Array(int[] arr) {
        if (arr[0] > arr[1]) {
            int t = arr[0];
            arr[0] = arr[1];
            arr[1] = t;
        }
        return arr;
    }

    static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        return arr;
    }
}
