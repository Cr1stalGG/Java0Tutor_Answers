package algorithmization.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i)
            arr[i] = scanner.nextInt();

        for(int i = 0; i < n; ++i)
            if(arr[i] > i)
                System.out.println(arr[i]);
    }
}
