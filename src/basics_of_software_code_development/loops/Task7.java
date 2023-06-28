package basics_of_software_code_development.loops;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        for(int i = m; i <= n; ++i){
            getDividersOfNumber(i);
        }
    }

    private static void getDividersOfNumber(int num){
        for(int i = 2; i <= num/2; ++i)
            if(num % i == 0)
                System.out.print(i + " ");

        System.out.println();
    }
}
