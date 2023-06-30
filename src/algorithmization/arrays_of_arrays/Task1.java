package algorithmization.arrays_of_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; ++i)
            for(int j = 0; j < m; ++j)
                arr[i][j] = scanner.nextInt();

        for(int i = 0; i < m; ++i) {
            int[] tmp = new int[n];
            for(int j = 0; j < n; ++j){
                tmp[j] = arr[j][i];

            }
            if(comparator(tmp))
                Arrays.stream(tmp).forEach(System.out::println);
        }

    }

    private static boolean comparator(int[] arr){
        if(arr[0] > arr[arr.length-1])
            return true;

        return false;
    }
}
