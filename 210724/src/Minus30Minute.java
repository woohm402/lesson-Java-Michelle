import java.util.Scanner;

// codeUp 1173번
public class Minus30Minute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        int timeMinus30 = (hour * 60 + minute) - 30;
        if (timeMinus30 < 0) timeMinus30 += 1440;

        System.out.printf("%d %d", timeMinus30 / 60, timeMinus30 % 60);
    }
}
