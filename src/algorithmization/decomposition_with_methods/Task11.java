package algorithmization.decomposition_with_methods;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(comparator(num1, num2));
    }

    private static String comparator(Integer a, Integer b){
        if(a.toString().length() > b.toString().length())
            return "First";
        else if(a.toString().length() == b.toString().length())
            return "Equals";
        else
            return "Second";
    }
}
