package basics_of_software_code_development.linear_programms;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x, y;
        double result;

        x = scanner.nextDouble();
        y = scanner.nextDouble();

        result = (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x*y);

        System.out.println(result);
    }
}
