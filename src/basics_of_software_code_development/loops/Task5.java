package basics_of_software_code_development.loops;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double e= scanner.nextDouble();

        double an = (double) 1 / 2 + (double) 1 / 3;
        int n = 1;
        double sum = an;

        while(e <= Math.abs(an)){
            n++;
            an = 1/Math.pow(2, n) + 1/Math.pow(3, n);
            sum += an;
        }

        System.out.println(sum);
    }
}
