public class ArrayPractices {
    public static void main(String[] args) {
        // test `fineIndex` function
        System.out.println("\n\n------test1 start------");
        int index = findIndex(new int[]{1, 2, 5, 4, 7}, 7);
        System.out.println(index); // expected: 4

        // test `printArray` function
        System.out.println("\n\n------test2 start------");
        printArray(new int[]{1, 5, 3}); // expected: 1, 5, 3

        // test `countTarget` function
        System.out.println("\n\n------test3 start------");
        System.out.println(countTarget(new int[]{1, 5, 5, 5, 3}, 5)); // expected: 3

        // test `swap` function
        System.out.println("\n\n------test4 start------");
        int[] toSwap = new int[]{1, 2, 3};
        swap(toSwap, 1, 2);
        printArray(toSwap); // expected: 1, 3, 2
    }

    static void printArray(int[] arr) {
        String a = "";
        for(int i = 0; i<arr.length; i++){
            if(i<arr.length-1){
                a+= arr[i] + ", ";
            }
            else{
                a+= arr[i];
            }
        }
        System.out.println(a);
    }

    // TODO implement
    //  @params arr array
    //  @params target target
    //  @returns index of target in array. if target is not found, return -1
    static int findIndex(int[] arr, int target) {
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    // TODO implement
    //  @params arr array
    //  @params target target
    //  @returns target이 arr에 몇 개 포함되어 있는지
    static int countTarget(int[] arr, int target) {
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }

    // TODO implement
    //  @brief swaps elements in index1, index2
    //  @params arr array
    //  @params index1 target index 1
    //  @params index2 target index 2
    static void swap(int[] arr, int index1, int index2) {
        int t;
        t = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = t;
    }
}
