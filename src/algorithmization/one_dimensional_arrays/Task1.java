package algorithmization.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i)
            arr[i] = scanner.nextInt();

        int k = scanner.nextInt();
        int sum = 0;

        for(int x : Arrays.stream(arr).filter(x -> x % k == 0).toArray())
            sum += x;

        System.out.println(sum);
    }
}
