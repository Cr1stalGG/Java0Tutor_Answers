package algorithmization.arrays_of_arrays;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; ++i)
            for(int j = 0; j < n; ++j)
                arr[i][j] = scanner.nextInt();

        System.out.println("Main diagonal: ");
        for(int i = 0; i < n; ++i)
            for(int j = 0; j < n; ++j)
                if(i == j)
                    System.out.println(arr[i][j]);

        System.out.println("Side diagonal: ");
        for(int i = 0; i < n; ++i)
            for(int j = 0; j < n; ++j)
                if(i + j == n-1)
                    System.out.println(arr[i][j]);
    }
}
