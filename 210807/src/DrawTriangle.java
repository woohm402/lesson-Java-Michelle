import java.util.Scanner;

public class DrawTriangle {
    public static void main (String[] args) {
        whilePractice();
    }

    static void whilePractice () {
        int a = 30;

        do {
            System.out.println(a);
            a /= 2;
        } while(a > 0);

        for (;a > 0;) {
            System.out.println(a);
            a /= 2;
        }
    }

    static void prob1352 () {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void prob1358 () {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < (n - 1) / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
