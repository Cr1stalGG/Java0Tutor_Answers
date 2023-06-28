package algorithmization.one_dimensional_arrays;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i)
            arr[i] = scanner.nextInt();

        int z = scanner.nextInt();

        for(int x : arr)
            System.out.println(Math.min(x, z));
    }
}
