import java.util.Scanner;

public class Assignments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // scanner 만듦
        int n = scanner.nextInt();                  // n = 3
        boolean[] isChecked = new boolean[n + 1];   // false, false, false, false

        for (int i = 0; i < n - 1; i++) {
            int num = scanner.nextInt();            // 3
            isChecked[num] = true;                  // [0, 1, 0, 1]
        }

        for (int i = 1; i <= n; i++) {
            if (!isChecked[i]) {
                System.out.println(i);
            }
        }
    }
}

/*

boolean -> true / false

 */
