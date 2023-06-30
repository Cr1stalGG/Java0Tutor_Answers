package algorithmization.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; ++i)
            arr[i] = scanner.nextInt();

        int j;
        for (int i = 1; i < n; i++) {
            int swap = arr[i];

            for (j = i; j > 0 && swap < arr[j - 1]; j--)
                arr[j] = arr[j - 1];

            arr[j] = swap;
        }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
