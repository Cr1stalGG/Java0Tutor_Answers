package basics_of_software_code_development.loops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num1 = scanner.next();
        String num2 = scanner.next();

        List<Character> coincidences = new ArrayList<>();

        for(Character a : num1.toCharArray())
            for(Character b : num2.toCharArray())
                if(a == b)
                    coincidences.add(a);

        System.out.println(new HashSet<>(coincidences));
    }
}
