package basics_of_software_code_development.loops;

public class Task6 {
    public static void main(String[] args) {
        for (int i = 0; i < 129; ++i)
            System.out.println(String.format("%s : %s", i, (char)i));
    }
}
