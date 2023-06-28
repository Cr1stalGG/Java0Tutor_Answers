package basics_of_software_code_development.linear_programms;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        int hour, min, sec;

        hour = T / 3600;
        min = T / 60 % 60;
        sec = T % 60;

        System.out.println(String.format("%02d:%02d:%02d", hour, min, sec));
    }
}
