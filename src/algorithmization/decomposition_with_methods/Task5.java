package algorithmization.decomposition_with_methods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i)
            arr[i] = scanner.nextInt();

        System.out.println(secondNumOfArray(arr));

    }

    private static int secondNumOfArray(int[] arr){
        arr = Arrays.stream(arr).sorted().toArray();

        return arr[arr.length-2];
    }
}
