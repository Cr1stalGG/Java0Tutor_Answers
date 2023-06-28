package basics_of_software_code_development.linear_programms;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c;
        double z;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        z = ((a - 3) * b / 2) + c;

        System.out.println(z);
    }
}
