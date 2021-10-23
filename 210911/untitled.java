import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] arr = line.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 't') {
                System.out.print(i + 1 + " ");
            }
        }
    }
}
