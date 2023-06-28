package basics_of_software_code_development.loops;

public class Task3 {
    public static void main(String[] args) {
        long sum = 0;

        for(int i = 1; i <= 100; ++i)
            sum += Math.pow(i, 2);

        System.out.println(sum);
    }
}
