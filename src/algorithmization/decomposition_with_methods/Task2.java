package algorithmization.decomposition_with_methods;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        System.out.println(NOK(NOK(num1, num2), NOK(num3, num4)));

    }

    private static int NOK(int a, int b){
        return a * b / NOD(a, b);
    }

    private static int NOD(int a, int b){
        int nod = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                nod = i;
            }
        }
        return nod;
    }
}
