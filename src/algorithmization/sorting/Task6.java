package algorithmization.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; ++i)
            arr[i] = scanner.nextInt();

        int tmp, j;
        for (int step = n / 2; step > 0; step /= 2)
            for (int i = step; i < n; i++)
            {
                tmp = arr[i];
                for (j = i; j >= step; j -= step)
                {
                    if (tmp < arr[j - step])
                        arr[j] = arr[j - step];
                    else
                        break;
                }
                arr[j] = tmp;
            }

        Arrays.stream(arr).forEach(System.out::println);
    }
}
