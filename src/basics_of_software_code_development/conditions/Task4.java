package basics_of_software_code_development.conditions;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, x, y, z;

        a = scanner.nextInt();
        b = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();

        if ((x <= a || x <= b && y <= a || y <= b) || (z <= a || z <= b && y <= a || y <= b) || (x <= a || x <= b && z <= a || z <= b))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
