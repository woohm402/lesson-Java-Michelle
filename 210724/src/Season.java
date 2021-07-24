import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int season = (month % 12) / 3;

        switch (season) {
            case 0:
                System.out.println("winter");
                break;
            case 1:
                System.out.println("spring");
                break;
            case 2:
                System.out.println("summer");
                break;
            case 3:
                System.out.println("fall");
                break;
        }
    }
}
