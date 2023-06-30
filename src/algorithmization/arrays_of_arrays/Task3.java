package algorithmization.arrays_of_arrays;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; ++i)
            for(int j = 0; j < n; ++j)
                arr[i][j] = scanner.nextInt();

        int k = scanner.nextInt();
        int p = scanner.nextInt();

        System.out.println("K's line: ");
        for(int i = 0; i < m; ++i)
            System.out.println(arr[k][i]);

        System.out.println("P's row: ");
        for(int i = 0; i < n; ++i)
            System.out.println(arr[i][p]);

    }
}
