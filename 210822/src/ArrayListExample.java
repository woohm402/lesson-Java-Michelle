/*

[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

 */

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0 ; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        for (int t = 0; t < n; t++) {
            for (int i = 0 ; i < n; i++) {
                System.out.printf("%d ", arr.get(i));
            }
            System.out.println();

            int tmp = arr.remove(0);
            arr.add(tmp);
        }
    }
}
