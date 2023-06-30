package algorithmization.decomposition_with_methods;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        System.out.println(square6(a));
    }

    private static double square6(double l){
        return 6 * Math.pow(l, 2) * Math.sqrt(3) / 4;
    }
}
