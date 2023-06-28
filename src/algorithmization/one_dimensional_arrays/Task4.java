package algorithmization.one_dimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i)
            arr[i] = scanner.nextInt();

        int maxValueIndex = getMax(arr);
        int minValueIndex = getMin(arr);

        int tmp = arr[maxValueIndex];
        arr[maxValueIndex] = arr[minValueIndex];
        arr[minValueIndex] = tmp;

        Arrays.stream(arr).forEach(System.out::println);
    }

    private static int getMax(int[] arr){
        int index = 0;

        for(int i = 0; i < arr.length; ++i)
            if(arr[i] > arr[index])
                index = i;

        return index;
    }

    private static int getMin(int[] arr){
        int index = 0;

        for(int i = 0; i < arr.length; ++i)
            if(arr[i] < arr[index])
                index = i;

        return index;
    }
}
