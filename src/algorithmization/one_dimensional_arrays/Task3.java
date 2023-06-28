package algorithmization.one_dimensional_arrays;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        int negative = 0, zero = 0, positive = 0;

        for(int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
            if(arr[i] > 0)
                positive++;
            else if(arr[i] == 0)
                zero++;
            else
                negative++;
        }

        System.out.println(String.format(" n: %s\n z: %s\n p: %s\n", negative, zero, positive));
    }
}
