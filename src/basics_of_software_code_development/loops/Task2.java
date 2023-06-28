package basics_of_software_code_development.loops;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        for(int x = a; x <= b; ++x){
            if(x > 2)
                System.out.println(x);
            else
                System.out.println(-x);
        }
    }
}
