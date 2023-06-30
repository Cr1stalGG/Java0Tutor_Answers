package algorithmization.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; ++i)
            arr[i] = scanner.nextInt();

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++)
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
