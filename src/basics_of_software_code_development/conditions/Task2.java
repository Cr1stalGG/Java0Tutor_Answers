package basics_of_software_code_development.conditions;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c, d;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();


        System.out.println(max(min(a, b),  min(c, d)));

    }

    public static int max(int a, int b){
        if(a > b)
            return a;
        return b;
    }

    public static int min(int a, int b){
        if(a < b)
            return a;
        return b;
    }
}
