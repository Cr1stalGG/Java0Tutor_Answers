package algorithmization.arrays_of_arrays;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] arr = new int[n][n];

        for(int i = 0; i < n; ++i)
            for(int j = 0; j < n; ++j)
                if(i % 2 == 0)
                    arr[i][j] = j+1;
                else
                    arr[i][j] = n - j;

        for(int i = 0; i < n; ++i) {
            System.out.println();
            for(int j = 0; j < n; ++j)
                System.out.print(arr[i][j] + " ");
        }
    }
}
