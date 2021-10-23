public class ArrayExamples {
    public static void main(String[] args) {

    }

    // @returns first element in given array
    static int getFirstElem(int[] arr) {
        return arr[0];
    }

    // @returns sum of elements in given array
    static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // @returns mean of elements in given array
    static double getMean(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return ((double)sum) / arr.length;
    }

    // @returns min + max values in given array
    // @example input: [1, 2, 6, 2, 3] -> output: 7
    static int getSumOfMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
        }

        return min + max;
    }
}
