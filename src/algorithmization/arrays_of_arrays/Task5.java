package algorithmization.arrays_of_arrays;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; ++i)
            for(int j = 0; j < n; ++j)
                if(j + i >= n)
                    arr[i][j] = 0;
                else
                    arr[i][j] = i+1;

        for(int i = 0; i < n; ++i) {
            System.out.println();
            for(int j = 0; j < n; ++j)
                System.out.print(arr[i][j] + " ");
        }
    }
}
