import java.util.Scanner;

// 1460번 풀이입니다.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        // TODO

        int count = 1;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                arr[i][j] = count;
                count = count + 1;
            }
        }

        // TODO

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
