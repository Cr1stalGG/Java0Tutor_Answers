package basics_of_software_code_development.conditions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b;

        a = scanner.nextDouble();
        b = scanner.nextDouble();

        if(a + b > 0 && a + b < 180) {
            System.out.println("Существует");

            if(a == 90 || b == 90 || 180 - (a+b) == 90)
                System.out.println("Прямоугольный");
            else
                System.out.println("Не прямоугольный");
        } else
            System.out.println("Не существует");
    }
}
