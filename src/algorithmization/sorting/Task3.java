package algorithmization.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];

        for(int i = 0; i < n; ++i)
            array[i] = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }

        Arrays.stream(array).forEach(System.out::println);
    }
}
