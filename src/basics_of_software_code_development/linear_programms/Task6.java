package basics_of_software_code_development.linear_programms;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y;

        x = scanner.nextInt();
        y = scanner.nextInt();

        boolean result =
                (y >= 0 && y <= 4 && x >= -2 && x <= 2) ||
                (y <= 0 && y >= -3 && x >=-4 && x <= 4);

        System.out.println(result);
    }
}
