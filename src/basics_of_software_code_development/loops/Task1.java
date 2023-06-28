package basics_of_software_code_development.loops;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        long sum = 0;

        for(int i = 1; i <= number; ++i)
            sum += i;

        System.out.println(sum);
    }
}
