package basics_of_software_code_development.linear_programms;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.next();

        String[] dividedNumber = number.split("\\.");

        String result = dividedNumber[1] + "." + dividedNumber[0];

        System.out.println(result);
    }
}
