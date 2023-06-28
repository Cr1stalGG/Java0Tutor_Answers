package basics_of_software_code_development.conditions;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double res, x;

        x = scanner.nextDouble();

        res = x <= 3 ? Math.pow(x, 2) - 3*x + 9 : 1 / (Math.pow(x, 3) + 6);

        System.out.println(res);
    }
}
