package basics_of_software_code_development.loops;

public class Task4 {
    public static void main(String[] args) {
        long add = 1;

        for(int i = 1; i <= 200; ++i)
            add *= Math.pow(i, 2);

        System.out.println(add);
    }
}
